package Lab8.c;

public class Part_Time_Student extends Student {
    Part_Time_Student() {
        super();
    }

    Part_Time_Student(int age, String name, String country) {
        super(age, name, country);
    }

    @Override
    public void study() {
        System.out.println("I'm studying on a part-time basis");
    }

    @Override
    public void printInfo() {
        System.out.println("Hi, my name is " + this.getName());
        System.out.println("I am " + this.getAge() + " years old");
        System.out.println("I am from " + this.getCountry());
    }
}
