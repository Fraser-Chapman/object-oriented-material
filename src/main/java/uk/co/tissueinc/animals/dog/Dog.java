package uk.co.tissueinc.animals.dog;

public class Dog {

    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void walk() {
        System.out.println("I am walking");
    }
}
