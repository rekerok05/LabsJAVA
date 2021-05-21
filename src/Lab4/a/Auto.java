package Lab4.a;

import java.util.Date;

public abstract class Auto implements Drive {
    ListCar name;
    int max_speed;
    Date yearOfRelease;
    String color;
    String countryOfRealease;

    public static void driver() {
        System.out.println("Fffff");

    }

    public ListCar getName() {
        return name;
    }

    public void setName(ListCar name) {
        this.name = name;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public Date getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(Date yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountryOfRealease() {
        return countryOfRealease;
    }

    public void setCountryOfRealease(String countryOfRealease) {
        this.countryOfRealease = countryOfRealease;
    }

    public void printInfo() {
        System.out.println("Car " + name + "have max speed " + max_speed);
    }
}