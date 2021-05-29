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
        this.sugar = this.weight / 10;
    }

    public double getSugar() {
        return this.sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
        this.weight = this.sugar * 10;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract void printInfo();
}


