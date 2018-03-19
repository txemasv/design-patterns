package creational.abstract_factory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AbstractFactoryTest {

    @Test
    public void createCreature_TypeHuman_Should_Create_Human_Using_HumanFactory() {
        Creature creature = Factory.createCreature("human");
        boolean isHuman = (creature instanceof Human);
        assertEquals(true, isHuman);
    }

    @Test
    public void createCreature_TypeAnimal_Should_Create_Animal_Using_AnimalFactory() {
        Creature creature = Factory.createCreature("animal");
        boolean isAnimal = (creature instanceof Animal);
        assertEquals(true, isAnimal);
    }
}
