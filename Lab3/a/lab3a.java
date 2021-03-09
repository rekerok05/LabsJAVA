package Lab3.a;

import java.util.ArrayList;
import java.util.Scanner;

public class lab3a {

    public static class Example {
        public static Scanner in = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        int num;
        do {
            System.out.print("0 - Exit\n1 - Add Customer\nInput: ");
            num = Example.in.nextInt();
            switch (num) {
                case 0:
                    System.exit(0);
                case 1:
                    addCustomer(customers);
            }
        } while (num != 0);

    }

    private static void addCustomer(ArrayList<Customer> customers) {
        System.out.print("1 - Automatic\n2 - Manually\nInput: ");
        int input = Example.in.nextInt();
        Customer tmp = new Customer();
        switch (input) {
            case 1:
                customers.add(tmp);
                break;
            case 2:
                tmp.SetAllInfo();
                break;
        }
    }
}


