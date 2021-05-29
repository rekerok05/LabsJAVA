package Lab4.b.TypeCandies;

import Dependencies.RandomDate;
import Lab4.b.Candy;
import Lab4.b.CandyType;

public class Chocolate extends Candy {
    private CandyType type = CandyType.Chocolate;
    public Chocolate() {
        this.setCountry("Russia");
        this.setWeight(RandomDate.getFaker().number().randomDouble(3,3,15));
        this.setSugar(this.getWeight() / 10);
    }

    public Chocolate(double weight, double sugar, String country) {
        this.setCountry(country);
        this.setWeight(weight);
        this.setSugar(sugar);
    }

    public void printInfo() {
        System.out.println("Type: " + this.type);
        System.out.println("Country = " + this.getCountry());
        System.out.println("Weight = " + this.getWeight());
        System.out.printf("Sugar = %.2f\n", this.getSugar());
    }
}
