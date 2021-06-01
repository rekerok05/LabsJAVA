package Lab7;

import Dependencies.Example;
import Dependencies.RandomDate;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Products> products = new ArrayList<>();
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addMoney(double money) {
        this.money += money;
    }

    Payment() {
        this.money = RandomDate.getFaker().number().randomDouble(2, 10, 20);
    }

    Payment(double money) {
        this.money = money;
    }

    public void toPay() {
        if (money >= Products.cost) {
            products.clear();
            System.out.println();
        } else {
            System.out.println("You don't have enough " + (Products.cost - money));
        }
    }

    public void addProduct() {
        int tmp = 0;
        do {
            System.out.println("Add product random - 1");
            System.out.println("Add product manually - 2");
            System.out.println("Exit - 0");
            System.out.print("Your select: ");
            tmp = Example.in.nextInt();
            switch (tmp) {
                case 1:
                    products.add(new Products());
                    break;
                case 2:
                    String title;
                    double price;
                    Example.in.nextLine();
                    System.out.print("Title product: ");
                    title = Example.in.nextLine();
                    System.out.print("Price product: ");
                    price = Example.in.nextDouble();
                    products.add(new Products(title, price));
                    break;

            }
            System.out.println();
        } while (tmp != 0);
    }

    public void printInfoCost() {
        for (Products product :
                this.products
        ) {
            product.printInfo();
            System.out.println();
        }
        System.out.println("Cost all products: " + Products.cost);
    }

    public static class Products {
        static double cost = 0;
        private String title;
        private double price;

        Products() {
            title = RandomDate.getFaker().esports().game();
            price = RandomDate.getFaker().number().randomDouble(2, 0, 100);
            cost += price;
        }

        Products(String title, double price) {
            this.title = title;
            this.price = price;
            cost += price;
        }

        public void printInfo() {
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
        }
    }

}
