package Lab4.b;

import Lab4.b.TypeCandies.Caramels;
import Lab4.b.TypeCandies.Chocolate;

public class lab4b {
    public static void main(String[] args) {
        Gift gift = new Gift(10);
        gift.printInfo();
        gift.sortByWeight();
        System.out.println();
        gift.printInfo();
        System.out.println("Weight gift = "+gift.getWeightGift());
    }
}
