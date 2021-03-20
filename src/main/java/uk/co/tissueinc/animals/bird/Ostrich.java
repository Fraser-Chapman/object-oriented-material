package uk.co.tissueinc.animals.bird;

public class Ostrich extends Bird {

    private final int runSpeed;

    public Ostrich(String name, int wingSpan, int age, int runSpeed) {
        super(name, wingSpan, age);
        this.runSpeed = runSpeed;
    }

    public void run() {
        System.out.println("I am running at " + runSpeed + " miles per hour");
    }
}
