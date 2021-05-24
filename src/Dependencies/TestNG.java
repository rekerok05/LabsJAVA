package Dependencies;

import Lab4.a.Car;
import Lab4.a.ListCar;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.assertEquals;

public class TestNG {
    private Car car = new Car(ListCar.BMW, 222, new Date(97, 4, 22), "Blue", "Belarus", 25, 10);

    @Test
    public void driveTest() throws Exception {
        int countDrive = 4;//RandomDate.getFaker().number().numberBetween(0, car.getFuelTank());
        for (int i = 0; i < countDrive; i++) {
            car.move();
            if (car.getFuel() == 0)
                break;
        }
        Assert.assertEquals(6, car.getFuel());
    }

    @Test
    public void refuel() throws Exception {
        int countRefuel = 15;
        Assert.assertEquals(21, car.getFuel());
    }

    @Test
    public void changeWheels() throws Exception {
        String tmpModelWheels = "MD-3310";
        Assert.assertEquals(car.wheels.);
    }
}
