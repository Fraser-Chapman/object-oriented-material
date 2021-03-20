package uk.co.tissueinc.animals.bird;

public class Bird {

    private final String name;
    private final int wingSpan;
    private final int age;

    public Bird(String name, int wingSpan, int age) {
        this.name = name;
        this.wingSpan = wingSpan;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getAge() {
        return age;
    }

    public void squawk() {
        System.out.println("Squawk!");
    }
}
