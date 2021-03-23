package Lab3.a;


import java.util.Scanner;

public class lab3a {

    public static class Example {
        public static Scanner in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(10);
        bank.printAllCustomers();
        bank.sortAlphabet();
        bank.printAllCustomers();
    }
}

