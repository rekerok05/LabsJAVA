package Lab4.b;

public abstract class Candy {
    private double weight;
    private double sugar;
    private String country;

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugar() {
        return this.sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printInfo() {
        System.out.println("weight = " + this.weight);
        System.out.printf("sugar = %.2f\n", this.sugar);
        System.out.println("country = " + this.country);
    }
}


