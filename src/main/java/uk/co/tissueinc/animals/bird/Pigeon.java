package uk.co.tissueinc.animals.bird;

public class Pigeon extends Bird implements CanFly {

    public Pigeon(String name, int wingSpan, int age) {
        super(name, wingSpan, age);
    }

    @Override
    public void fly() {
        System.out.println("I am a pigeon and I am flying");
    }
}
