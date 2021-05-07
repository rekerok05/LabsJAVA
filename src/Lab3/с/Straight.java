package Lab3.с;

public class Straight {
    // private
    Point pnt1;
    Point pnt2;
    Point guideVector;
    //

    public Point getPnt1() {
        return pnt1;
    }

    public Straight() {

    }

    public Straight(Point pnt1, Point pnt2) {
        this.pnt1 = pnt1;
        this.pnt2 = pnt2;
        this.guideVector = new Point(pnt2.getX().difference(pnt1.getX()),
                pnt2.getY().difference(pnt1.getY()),
                pnt2.getZ().difference(pnt1.getZ()));
    }

    public void setPnt1(Point pnt1) {
        this.pnt1 = pnt1;
    }

    public Point getPnt2() {
        return pnt2;
    }

    public void setPnt2(Point pnt2) {
        this.pnt2 = pnt2;
    }

    public Point getGuideVector() {
        return guideVector;
    }

    public void setGuideVector(Point guideVector) {
        this.guideVector = guideVector;
    }

    @Override
    public String toString() {
        return "pnt1 = (" + pnt1.print() + ")\tpnt2 = " + pnt2.print();
    }
}
