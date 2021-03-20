package uk.co.tissueinc.animals.bird;

public class Seagull extends Bird implements CanFly {

    public Seagull(String name, int wingSpan, int age) {
        super(name, wingSpan, age);
    }

    public void stealFood() {
        System.out.println("i'm stealing your food");
    }

    @Override
    public void fly() {
        System.out.println("I am a Seagull and I am flying");
    }
}
