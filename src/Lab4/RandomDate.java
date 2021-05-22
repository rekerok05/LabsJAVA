package Lab4;

import com.github.javafaker.Faker;

public class RandomDate {
    private final static Faker faker = new Faker();

    public static Faker getFaker() {
        return faker;
    }
}
