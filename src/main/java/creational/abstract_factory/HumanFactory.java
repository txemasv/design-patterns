package creational.abstract_factory;

public class HumanFactory implements CreatureFactory {
    @Override
    public Creature createCreature() {
        return new Human();
    }
}
