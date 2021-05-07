package Lab3.с;

import Lab3.b.lab3b;

import java.util.ArrayList;

public class Area {
    private ArrayList<Straight> straights = new ArrayList<>();

    private boolean intersectionX(Straight straight) {
        if ((straight.pnt1.getX().getNum() >= 0 && straight.pnt2.getX().getNum() <= 0) ||
                (straight.pnt1.getX().getNum() <= 0 && straight.pnt2.getX().getNum() >= 0)) {
            if ((straight.pnt1.getY().getNum() == 0 && straight.pnt2.getY().getNum() == 0) &&
                    (straight.pnt1.getZ().getNum() != 0 || straight.pnt2.getZ().getNum() != 0)) {
                return true;
            }
            if ((straight.pnt1.getZ().getNum() == 0 && straight.pnt2.getZ().getNum() == 0) &&
                    (straight.pnt1.getY().getNum() != 0 || straight.pnt2.getY().getNum() != 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean intersectionY(Straight straight) {
        if ((straight.pnt1.getY().getNum() >= 0 && straight.pnt2.getY().getNum() <= 0) ||
                (straight.pnt1.getY().getNum() <= 0 && straight.pnt2.getY().getNum() >= 0)) {
            if ((straight.pnt1.getX().getNum() == 0 && straight.pnt2.getX().getNum() == 0) &&
                    (straight.pnt1.getZ().getNum() != 0 || straight.pnt2.getZ().getNum() != 0)) {
                return true;
            }
            if ((straight.pnt1.getZ().getNum() == 0 && straight.pnt2.getZ().getNum() == 0) &&
                    (straight.pnt1.getX().getNum() != 0 || straight.pnt2.getX().getNum() != 0)) {
                return true;
            }
        }
        return false;
    }

    private boolean intersectionZ(Straight straight) {
        if ((straight.pnt1.getZ().getNum() >= 0 && straight.pnt2.getZ().getNum() <= 0) ||
                (straight.pnt1.getZ().getNum() <= 0 && straight.pnt2.getZ().getNum() >= 0)) {

            if ((straight.pnt1.getX().getNum() == 0 && straight.pnt2.getX().getNum() == 0) &&
                    (straight.pnt1.getY().getNum() != 0 || straight.pnt2.getY().getNum() != 0)) {
                return true;
            }

            if ((straight.pnt1.getY().getNum() == 0 && straight.pnt2.getY().getNum() == 0) &&
                    (straight.pnt1.getX().getNum() != 0 || straight.pnt2.getX().getNum() != 0)) {
                return true;
            }
        }
        return false;
    }

    public Area(int count) {
        rndStraights(count);
    }

    private RationalFraction[] rndPointForStraight() {
        return new RationalFraction[]{new RationalFraction(new int[]{-3, 3}),
                new RationalFraction(new int[]{-3, 3}),
                new RationalFraction(new int[]{-3, 3})};
    }

    public void parallelLines() {
        for (int i = 0; i < straights.size(); i++) {
            System.out.println("Straight " + (i + 1) + " guide Vector = " + straights.get(i).getGuideVector().print() + " parallel with line");
            for (int j = i + 1; j < straights.size(); j++) {
                if (straights.get(i).getGuideVector().getX().divide(straights.get(j).guideVector.getX())
                        .isEqual((straights.get(i).getGuideVector().getY().divide(straights.get(j).guideVector.getY()))) &&
                        straights.get(i).getGuideVector().getY().divide(straights.get(j).guideVector.getY())
                                .isEqual(straights.get(i).getGuideVector().getZ().divide(straights.get(j).guideVector.getZ()))) {
                    System.out.println("\tStraight " + (j + 1) + "guide Vector = " + straights.get(i).getGuideVector().print());
                }
            }
        }
    }

    public void axisIntersection() {
        for (int i = 0; i < straights.size(); i++) {
            System.out.println("Line " + (i + 1) + " " + straights.get(i).toString() + " axis intersection ");
            if (this.intersectionX(this.straights.get(i)))
                System.out.println("\taxis X");
            if (this.intersectionY(this.straights.get(i)))
                System.out.println("\taxis Y");
            if (this.intersectionZ(this.straights.get(i)))
                System.out.println("\taxis Z");
        }
    }

    public void addStraight(Straight straight) {
        straights.add(straight);
    }

    public void rndStraights(int count) {
        for (int i = 0; i < count; i++) {
            straights.add(rndStraight());
        }
    }

    private Straight rndStraight() {
        return new Straight(new Point(rndPointForStraight()), new Point(rndPointForStraight()));
    }

}
