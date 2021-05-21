package Lab4.a;

public enum ListCar {
    Mazda,
    Toyota,
    Ford,
    Fiat,
    Volkswagen,
    BMW;

    public static ListCar getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
