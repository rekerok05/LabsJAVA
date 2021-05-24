package Lab4.a;

import Dependencies.RandomDate;

public class Wheels {
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
