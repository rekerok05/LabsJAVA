package Lab3.a;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

import java.util.*;

public class Customer {
    // privat attr
    private static int Count = 0;
    private int id;
    private String name;
    private String surname;
    private String middle_name;
    private String address;
    private String credit_card_number;
    private String bank_account_number;

    Faker faker = new Faker();

    // private methods
    private void addDash() {

    }

    // public

    public Customer() {
        id = ++Count;
        this.name = faker.name().firstName();
        this.surname = faker.name().lastName();
        this.middle_name = faker.name().firstName();
        this.address = faker.address().fullAddress();
        this.credit_card_number = faker.finance().creditCard(CreditCardType.MASTERCARD);
        this.bank_account_number = faker.crypto().md5();
    }

    public static int getCount() {
        return Count;
    }

    public static void setCount(int count) {
        Count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getBank_account_number() {
        return bank_account_number;
    }

    public void setBank_account_number(String bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    public void printInfoCustomer() {
        System.out.println("Name (Middle): " + this.name
                + " (" + this.middle_name + ") " + this.surname);
        System.out.println("Address: " + this.address);
        System.out.println("Credit card number: " + this.credit_card_number);
        System.out.println("Bank account number: " + this.bank_account_number + "\n");
    }

    public void SetAllInfo() {
        lab3a.Example.in.nextLine();
        System.out.print("New name: ");
        this.name = lab3a.Example.in.nextLine();
        System.out.print("New surname: ");
        this.surname = lab3a.Example.in.nextLine();
        System.out.print("New middle name: ");
        this.middle_name = lab3a.Example.in.nextLine();
        System.out.print("New address: ");
        this.address = lab3a.Example.in.nextLine();
        // System.out.print("New credit card number: " + (this.credit_card_number = lab3a.Example.in.nextLine()));
        // System.out.print("New bank account number: " + (this.bank_account_number = lab3a.Example.in.nextLine()));
    }

}
