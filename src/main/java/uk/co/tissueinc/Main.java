package uk.co.tissueinc;

import uk.co.tissueinc.animals.bird.*;
import uk.co.tissueinc.animals.dog.Chihuahua;
import uk.co.tissueinc.animals.dog.Dog;
import uk.co.tissueinc.animals.dog.GermanShepherd;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        dogExample();
        birdExample();
        canFlyExample();
    }

    private static void canFlyExample() {
        CanFly pigeon = new Pigeon("Henry", 5, 3);
        CanFly seagull = new Seagull("Larry", 10, 2);

        List<CanFly> birdsThatCanFly = List.of(pigeon, seagull);
        for (CanFly bird : birdsThatCanFly) {
            bird.fly();
        }
    }

    private static void birdExample() {
        Bird pigeon = new Pigeon("Henry", 5, 3);
        Bird seagull = new Seagull("Larry", 10, 2);
        Bird ostrich = new Ostrich("Betty", 15, 5, 10);

        List<Bird> birds = List.of(pigeon, seagull, ostrich);

        for (Bird bird : birds) {
            bird.squawk();
        }
    }

    private static void dogExample() {
        Dog max = new GermanShepherd("Max", 3);
        Dog foxy = new Chihuahua("Foxy", 5, true);
        Chihuahua ruby = new Chihuahua("Ruby", 4, true);

        max.bark();
        foxy.bark();

//        System.out.println(foxy.isAnnoying);
        System.out.println(ruby.isAnnoying());
    }
}
