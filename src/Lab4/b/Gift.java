package Lab4.b;

import Lab4.b.TypeCandies.Caramels;
import Lab4.b.TypeCandies.Chocolate;
import Lab4.b.TypeCandies.Icicles;
import Lab4.b.TypeCandies.Toffee;
import Dependencies.RandomDate;

import java.util.Collections;

import java.util.ArrayList;

public class Gift {
    private ArrayList<Candy> gift = new ArrayList<Candy>();
    private Candy tmpCandies[] = new Candy[]{new Caramels(), new Chocolate(), new Icicles(), new Toffee()};

    public double getWeightGift() {
        return weightGift;
    }

    public void setWeightGift(double weightGift) {
        this.weightGift = weightGift;
    }

    private double weightGift = 0;

    public ArrayList<Candy> getGift() {
        return gift;
    }

    public void setGift(ArrayList<Candy> gift) {
        this.gift = gift;
    }

    public Gift(int count) {
        for (int i = 0; i < count; i++) {
            Candy tmp = tmpCandies[RandomDate.getFaker().number().numberBetween(0, tmpCandies.length)];
            tmp.setWeight(RandomDate.getFaker().number().randomDouble(3, 3, 15));
            this.addCandy(tmp);
        }
    }

    public Gift(ArrayList<Candy> gift) {
        this.gift = gift;
    }

    public void addCandy(Candy candy) {
        gift.add(candy);
        this.weightGift += candy.getWeight();
    }

    public void sortByWeight() {
        for (int i = 1; i < this.gift.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (this.gift.get(j).getWeight() > this.gift.get(j - 1).getWeight()) {
                    Collections.swap(this.gift, j, j - 1);
                }
            }
        }
    }

    public void printInfo() {
        for (int i = 0; i < this.gift.size(); i++) {
            System.out.print((i + 1) + ") ");
            this.gift.get(i).printInfo();
            System.out.println();
        }
    }
}
