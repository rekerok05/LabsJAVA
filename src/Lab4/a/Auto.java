package Lab4.a;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Auto {
    ListCar name;
    int max_speed;
    Date dateOfRelease;
    String color;
    String countryOfRealease;
    int fuelTank;
    int fuel;

    public abstract void move();

    public abstract void stop();

    public void refuel() {
        if (fuel < fuelTank) {
            fuel++;
        }
    }

    public void refuel(int count) {
        if (this.fuel + count >= fuelTank) {
            fuel = fuelTank;
        } else {
            fuel = fuel + count;
        }
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
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

    public Date getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(Date dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
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

    public abstract void printInfo();
}