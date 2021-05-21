package Lab4.a;

public interface Drive {
    Wheels wheels = new Wheels();
    Engine engine = new Engine();

    private void drive() {
        if (engine.getStatus() == Status.ON)
    }
}

class Wheels {
    private String modelWheels;
    private Boolean seasonalTtires;
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