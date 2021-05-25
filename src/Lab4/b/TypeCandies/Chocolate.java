package Lab4.b.TypeCandies;
import Lab4.b.Candy;

public class Chocolate extends Candy {
    public Chocolate() {
        this.setCountry("Russia");
        this.setWeight(4.4);
        this.setSugar(this.getWeight() / 10);
    }
}
