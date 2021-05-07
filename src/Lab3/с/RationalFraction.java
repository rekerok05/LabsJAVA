package Lab3.с;

import Lab3.b.Complex;
import Lab3.b.lab3b;

public class RationalFraction {
    // private
    private int num, den;

    public RationalFraction(int[] range) {
        this.num = lab3b.rndNumber(range[0], range[1]);
        this.den = lab3b.rndNumber(range[0], range[1]);
        this.simplify();
    }

    private void simplify() {
        for (int i = Math.abs(Math.min(this.num, this.den)); i >= 2; i--)
            if (this.num % i == 0 && this.den % i == 0) {
                this.num /= i;
                this.den /= i;
            }
        if (num < 0 && den < 0) {
            num = Math.abs(num);
            den = Math.abs(den);
        }
        if (den == 0)
            den = 1;
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

    public boolean isEqual(RationalFraction RF) {
        if (this.num == RF.num && this.den == RF.den)
            return true;
        else {
            return false;
        }
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
        RationalFraction tmp = new RationalFraction(this.num * rf.num, this.den * rf.den);
        tmp.simplify();
        return tmp;
    }

    public RationalFraction divide(RationalFraction rf) {
        RationalFraction tmp = new RationalFraction(this.num * rf.den, this.den * rf.num);

        tmp.simplify();
        return tmp;
    }

    public void equal(RationalFraction rf) {
        this.num = rf.num;
        this.den = rf.den;
    }

    public void getRandomRF(int min, int max) {
        this.num = lab3b.rndNumber(min, max);
        this.den = lab3b.rndNumber(min, max);
    }

    // Print
    public String print() {
        return num + "/" + den;
    }
}
