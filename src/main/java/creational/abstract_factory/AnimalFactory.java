package creational.abstract_factory;

public class AnimalFactory implements CreatureFactory {
    @Override
    public Creature createCreature () {
        return new Animal();
    }
}
