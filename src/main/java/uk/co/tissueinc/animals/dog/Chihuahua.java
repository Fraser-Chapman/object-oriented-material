package uk.co.tissueinc.animals.dog;

public class Chihuahua extends Dog {

    private final boolean isAnnoying;

    public Chihuahua(String name, int age, boolean isAnnoying) {
        super(name, age);
        this.isAnnoying = isAnnoying; // They are always annoying. Stupid question.
    }

    public boolean isAnnoying() {
        return isAnnoying;
    }

    @Override
    public void bark() {
        System.out.println("Yap!!");
    }
}
