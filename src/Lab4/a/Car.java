package Lab4.a;

import Dependencies.RandomDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car extends Auto {
    public Engine engine = new Engine();
    public Wheels wheels = new Wheels();

    public Car() {
        name = ListCar.getRandom();
        max_speed = RandomDate.getFaker().number().numberBetween(200, 350);
        dateOfRelease = RandomDate.getFaker().date().between(new Date(60, 1, 1), new Date(121, 1, 1));
        color = RandomDate.getFaker().color().name();
        countryOfRealease = RandomDate.getFaker().country().name();
        fuelTank = RandomDate.getFaker().number().numberBetween(5, 25);
        fuel = RandomDate.getFaker().number().numberBetween(1, fuelTank);
        engine.setStatus(Status.ON);
    }

    public Car(ListCar name, int max_speed, Date yearOfRelease, String color, String countryOfRealease, int fuelTank, int fuel) {
        this.name = name;
        this.max_speed = max_speed;
        this.dateOfRelease = yearOfRelease;
        this.color = color;
        this.countryOfRealease = countryOfRealease;
        this.fuelTank = fuelTank;
        this.fuel = fuel;
        engine.setStatus(Status.ON);
    }

    @Override
    public void move() {
        if (engine.getStatus() == Status.ON && fuel != 0) {
            wheels.setStatus(Status.ON);
            fuel--;
        } else if (fuel == 0) {
            System.out.println("Need to refuel");
        } else if (engine.getStatus() == Status.OFF) {
            System.out.println("Need on Engine");
        }
    }

    @Override
    public void stop() {
        wheels.setStatus(Status.OFF);
    }

    @Override
    public void printInfo() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Car " + name);
        System.out.println("Date of release car " + formatter.format(dateOfRelease));
        System.out.println("Max speed " + max_speed);
        System.out.println("Color " + color);
        System.out.println("Country " + countryOfRealease);
        System.out.println("Fuel now " + fuel);
        System.out.println("Max fuel " + fuelTank);
        System.out.println("Model wheels " + wheels.getModelWheels());
        System.out.println("Model engine " + engine.getModelEngine());
    }
}


enum Status {
    ON,
    OFF
}