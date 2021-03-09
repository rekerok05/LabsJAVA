package Lab3.a;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

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
        this.credit_card_number = faker.finance().creditCard(CreditCardType.VISA);
        this.bank_account_number = faker.crypto().md5();
    }

    public void printInfoCustomer() {
        System.out.println("Name (Middle): " + this.name
                + " (" + this.middle_name + ") " + this.surname);
        System.out.println("Address: " + this.address);
        System.out.println("Credit card number: " + this.credit_card_number);
        System.out.println("Bank account number: " + this.bank_account_number);
    }

    // Getters
    public int GetId() {
        return this.id;
    }

    public String GetName() {
        return this.name;
    }

    public String GetSurname() {
        return this.surname;
    }

    public String GetMiddle_name() {
        return this.middle_name;
    }

    public String GetAdress() {
        return this.address;
    }

    public String GetCredit_card_number() {
        return this.credit_card_number;
    }

    public String GetBank_account_number() {
        return this.bank_account_number;
    }

    // Setters
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
        System.out.print("New credit card number: " + (this.credit_card_number = lab3a.Example.in.nextLine()));
        System.out.print("New bank account number: " + (this.bank_account_number = lab3a.Example.in.nextLine()));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void SetCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public void SetBank_account_number(String bank_account_number) {
        this.bank_account_number = bank_account_number;
    }

    // Operators
    public boolean equal
}
