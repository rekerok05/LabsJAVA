package Lab3.с;

public class Point {
    private RationalFraction x, y, z;

    // public
    public Point() {

    }

    public Point(RationalFraction x, RationalFraction y, RationalFraction z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(RationalFraction[] arrRF) {
        this.x = arrRF[0];
        this.y = arrRF[1];
        this.z = arrRF[2];
    }

    public RationalFraction getX() {
        return x;
    }

    public void setX(RationalFraction x) {
        this.x = x;
    }

    public RationalFraction getY() {
        return y;
    }

    public void setY(RationalFraction y) {
        this.y = y;
    }

    public RationalFraction getZ() {
        return z;
    }

    public void setZ(RationalFraction z) {
        this.z = z;
    }

    public String print() {
        return "(" + x.print() + ", " + y.print() + ", " + z.print() + ")";
    }
}
