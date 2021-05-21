package Lab4.a;

import com.github.javafaker.Faker;

import java.util.Date;

public class Car extends Auto {
    private Faker faker = new Faker();

    Car() {
        name = ListCar.getRandom();
        max_speed = faker.number().numberBetween(200, 350);
        yearOfRelease = faker.date().between(new Date(1960, 1, 1), new Date(2021, 1, 1));
    }

    @Override
    public ListCar getName() {
        return super.getName();
    }

    @Override
    public void setName(ListCar name) {
        super.setName(name);
    }

    @Override
    public int getMax_speed() {
        return super.getMax_speed();
    }

    @Override
    public void setMax_speed(int max_speed) {
        super.setMax_speed(max_speed);
    }

    @Override
    public Date getYearOfRelease() {
        return super.getYearOfRelease();
    }

    @Override
    public void setYearOfRelease(Date yearOfRelease) {
        super.setYearOfRelease(yearOfRelease);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getCountryOfRealease() {
        return super.getCountryOfRealease();
    }

    @Override
    public void setCountryOfRealease(String countryOfRealease) {
        super.setCountryOfRealease(countryOfRealease);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

}
