package creational.abstract_factory;

public class Human implements Creature {

    @Override
    public void eat() {
        System.out.println("I'm a human");
        System.out.println("I'm eating");
    }

    @Override
    public void sleep() {
        System.out.println("I'm a human");
        System.out.println("I'm sleeping");
    }
}
