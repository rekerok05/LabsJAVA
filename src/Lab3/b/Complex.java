package Lab3.b;

public class Complex {

    // private
    int x, y;


    // public
    public Complex() {
        this.x = this.y = 0;
    }

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    // Operators
    public Complex sum(Complex complex) {
        return new Complex(this.x + complex.x, this.y + complex.y);
    }



    public Complex difference(Complex complex) {
        return new Complex(this.x - complex.x, this.y - complex.y);
    }

    public Complex product(Complex complex) {
        return new Complex(this.x * complex.x - this.y * complex.y,
                this.x * complex.y + complex.x * this.y);
    }

    public Complex degree(int degree) {
        Complex complex = new Complex(this.x, this.y);
        Complex tmp = new Complex(this.x, this.y);
        for (int i = 0; i < degree - 1; i++)
            complex = complex.product(tmp);
        return complex;
    }

    public void equal(Complex complex) {
        this.x = complex.x;
        this.y = complex.y;
    }


    // Print
    public void print() {
        System.out.printf("%d%+di\n", x, y);
    }
}
