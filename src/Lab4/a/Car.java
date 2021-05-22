package Lab4.a;

import Lab4.RandomDate;
import com.github.javafaker.Faker;

import java.util.Date;

public class Car extends Auto {
    private Engine engine = new Engine();
    private Wheels wheels = new Wheels();

    Car() {
        name = ListCar.getRandom();
        max_speed = RandomDate.getFaker().number().numberBetween(200, 350);
        yearOfRelease = RandomDate.getFaker().date().between(new Date(1960, 1, 1), new Date(2021, 1, 1));
    }

}

class Wheels {
    private String modelWheels = RandomDate.getFaker().space().meteorite();
    // private Boolean seasonalTtires;
    private Status status = Status.OFF;

    public String getModelWheels() {
        return modelWheels;
    }

    public void setModelWheels(String modelWheels) {
        this.modelWheels = modelWheels;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

class Engine {
    private Status status = Status.OFF;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

enum Status {
    ON,
    OFF
}