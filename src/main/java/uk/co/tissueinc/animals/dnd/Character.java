package uk.co.tissueinc.animals.dnd;

public class Character {

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private String alignment;
    private String background;
    private int constitution;
    private int stealth;
    private int initiative;
    private int strength;

    public Character(String firstName, String lastName, int age, int height, String alignment, String background,
                     int constitution, int stealth, int initiative, int strength) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.alignment = alignment;
        this.background = background;
        this.constitution = constitution;
        this.stealth = stealth;
        this.initiative = initiative;
        this.strength = strength;
    }

    public void meleeAttack() {
        System.out.printf("Swings weapon for %s damage%n", strength);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getBackground() {
        return background;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getStealth() {
        return stealth;
    }

    public int getInitiative() {
        return initiative;
    }


}
