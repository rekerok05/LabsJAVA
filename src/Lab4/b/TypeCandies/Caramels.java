package Lab4.b.TypeCandies;

import Lab4.b.Candy;

public class Caramels extends Candy {

    public Caramels() {
        this.setCountry("Belarus");
        this.setWeight(7);
        this.setSugar(this.getWeight() / 10);
    }
}
