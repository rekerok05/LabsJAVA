package Lab8.c;

import Dependencies.RandomDate;

public abstract class Student implements Entrant{
    private int age;
    private String name;
    private String country;

    Student(){
        this.age = RandomDate.getFaker().number().numberBetween(15,20);
        this.name = RandomDate.getFaker().name().fullName();
        this.country = RandomDate.getFaker().country().name();
    }

    Student(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public abstract void printInfo();
}
