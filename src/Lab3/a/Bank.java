package Lab3.a;

import Dependencies.Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompatatorString implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

public class Bank {
    // Private
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    // Public
    public Bank() {

    }

    public Bank(int count) {
        System.out.print("How input?\n1 - Manually\n2 - Authomatic\n3 - Exit\ninput: ");
        int tmp = Example.in.nextInt();
        System.out.println("");
        switch (tmp) {
            case 1:
                for (int i = 0; i < count; i++) {
                    System.out.print((i + 1) + ") ");
                    customers.add(addCustomerManually());
                    System.out.println("");
                }

                break;
            case 2:
                for (int i = 0; i < count; i++)
                    customers.add(new Customer());
                break;
            case 3:
                break;
        }

    }

    public Customer addCustomerManually() {
        Customer tmp = new Customer();
        tmp.SetAllInfo();
        return tmp;
    }

    public void sortAlphabet() {
        Collections.sort(customers, new CompatatorString());
    }

    public void printAllCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.print(i + 1 + ") ");
            customers.get(i).printInfoCustomer();
        }
    }
}
