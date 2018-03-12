package creational.factory;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FactoryTest {

    @Test
    public void createHuman_Man_Should_Create_GenesXX() {
        Human human = Factory.createHuman(Human.MAN);
        assert human != null;
        String genes = human.getGenes();
        assertEquals(genes, "xx");
    }

    @Test
    public void createHuman_Woman_Should_Create_GenesXY() {
        Human human = Factory.createHuman(Human.WOMAN);
        assert human != null;
        String genes = human.getGenes();
        assertEquals(genes, "xy");
    }
}
