package Lab4.b;

import Lab4.b.TypeCandies.Caramels;
import Lab4.b.TypeCandies.Chocolate;
import Lab4.b.TypeCandies.Icicles;
import Lab4.b.TypeCandies.Toffee;
import Dependencies.RandomDate;

import java.util.ArrayList;

public class Gift {
    private ArrayList<Candy> gift = new ArrayList<Candy>();

    public ArrayList<Candy> getGift() {
        return gift;
    }

    public void setGift(ArrayList<Candy> gift) {
        this.gift = gift;
    }

    public Gift(int count) {
        Candy tmpCandies[] = new Candy[]{new Caramels(), new Chocolate(), new Icicles(), new Toffee()};
        for (int i = 0; i < count; i++) {
            gift.add(tmpCandies[RandomDate.getFaker().number().numberBetween(0, tmpCandies.length)]);
        }
    }


    public Gift(ArrayList<Candy> gift) {
        this.gift = gift;
    }


    public void addCandy(Candy candy) {
        gift.add(candy);
    }
}
