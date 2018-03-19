package creational.abstract_factory;

public class Factory {
    public static Creature createCreature(String type) {

        CreatureFactory factory;

        switch (type) {
            case "human":
                factory = new HumanFactory();
                break;
            case "animal":
                factory = new AnimalFactory();
                break;
            default:
                throw new RuntimeException("The type '" + type + " don't exists in collection.");
        }

        return factory.createCreature();
    }
}
