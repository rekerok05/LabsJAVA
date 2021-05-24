package Lab4.a;

import Dependencies.RandomDate;

public class Engine {
    private String modelEngine = RandomDate.getFaker().space().star();
    private Status status = Status.OFF;

    public String getModelEngine() {
        return modelEngine;
    }

    public void setModelEngine(String modelEngine) {
        this.modelEngine = modelEngine;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
