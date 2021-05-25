package Lab4.b;

public enum CandyType {
    Chocolate,
    Icicles,
    Toffee,
    Caramels;

    public static CandyType getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
