package Lab3.с;

import Lab3.b.Complex;

public class RationalFraction {
    // private
    private int num, den;

    private void simplify() {
        for (int i = Math.abs(Math.min(this.num, this.den)); i >= 2; i--)
            if (this.num % i == 0 && this.den % i == 0) {
                this.num /= i;
                this.den /= i;
            }
    }

    // public
    public RationalFraction() {
        this.num = 0;
        this.den = 1;
    }

    public RationalFraction(int num, int den) {
        this.num = num;
        this.den = den;
        this.simplify();
    }

    // Getters and Setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        if (den == 0) {
            System.out.println("error: denominator cannot be zero");
            this.den = 1;
        } else
            this.den = den;
    }

    // Operators
    public RationalFraction sum(RationalFraction rf) {
        RationalFraction tmp = new RationalFraction((num * rf.den) + (rf.num * den),
                (den * rf.den));
        tmp.simplify();
        return tmp;
    }

    public RationalFraction difference(RationalFraction rf) {
        RationalFraction tmp = new RationalFraction((num * rf.den) - (rf.num * den),
                (den * rf.den));
        tmp.simplify();
        return tmp;
    }

    public RationalFraction product(RationalFraction rf) {
        RationalFraction tmp = new RationalFraction(this.num * rf.num, this.den * rf.num);
        tmp.simplify();
        return tmp;
    }

    public void equal(RationalFraction rf) {
        this.num = rf.num;
        this.den = rf.den;
    }

    // Print
    public void print() {
        System.out.printf("%d/%d\n", num, den);
    }
}
