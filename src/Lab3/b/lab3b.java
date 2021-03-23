package Lab3.b;

import Lab3.a.lab3a;

import java.util.ArrayList;

public class lab3b {
    public static void main(String[] args) {
        ArrayList<Complex> complex = new ArrayList<Complex>();
        System.out.print("size array\nInput: ");
        int count = lab3a.Example.in.nextInt();
        System.out.println("");
        System.out.print("1 = auto\t2 = manually\nInput: ");
        int tmp = lab3a.Example.in.nextInt();
        switch (tmp) {
            case 1:
                for (int i = 0; i < count; i++) {
                    Complex tmpComplex = new Complex(rndNumber(-5, 5),
                            rndNumber(-5, 5));
                    complex.add(tmpComplex);
                }
            case 2:
        }
        printArray(complex);
        // sumArray(complex);
        // productArray(complex);
        System.out.println("SUM");
        sumTwoNumber(complex);
        System.out.println("PRODUCT");
        productTwoNumber(complex);
    }

    private static void productTwoNumber(ArrayList<Complex> complexes) {
        int select;
        int select2;
        System.out.print("number 1: ");
        select = lab3a.Example.in.nextInt();
        System.out.print("number 2: ");
        select2 = lab3a.Example.in.nextInt();
        Complex tmp = complexes.get(select).product(complexes.get(select2));
        tmp.print();
    }

    private static void sumTwoNumber(ArrayList<Complex> complexes) {
        int select;
        int select2;
        System.out.print("number 1: ");
        select = lab3a.Example.in.nextInt();
        System.out.print("number 2: ");
        select2 = lab3a.Example.in.nextInt();
        Complex tmp = complexes.get(select).sum(complexes.get(select2));
        tmp.print();
    }

    public static int rndNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static void printArray(ArrayList<Complex> complexes) {
        for (int i = 0; i < complexes.size(); i++) {
            System.out.print(i + ") ");
            complexes.get(i).print();

        }
    }

    public static void sumArray(ArrayList<Complex> complexes) {
        Complex tmp = new Complex();
        for (int i = 0; i < complexes.size(); i++)
            tmp = tmp.sum(complexes.get(i));
        System.out.print("sum Array = ");
        tmp.print();
        System.out.println("");
    }

    public static void productArray(ArrayList<Complex> complexes) {
        Complex tmp = new Complex(1, 1);
        for (int i = 0; i < complexes.size(); i++)
            tmp = tmp.product(complexes.get(i));
        System.out.print("product Array = ");
        tmp.print();
        System.out.println("");
    }
}