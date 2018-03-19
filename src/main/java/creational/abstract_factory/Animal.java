package creational.abstract_factory;

public class Animal implements Creature {

    @Override
    public void eat() {
        System.out.println("I'm an animal");
        System.out.println("I'm eating");
    }

    @Override
    public void sleep() {
        System.out.println("I'm an animal");
        System.out.println("I'm sleeping");
    }
}

