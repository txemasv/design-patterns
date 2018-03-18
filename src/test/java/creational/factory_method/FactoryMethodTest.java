package creational.factory_method;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FactoryMethodTest {
    @Test
    public void levelGenerator_Should_Create_Dungeons_Using_Specific_Instance() {
        LevelGenerator level1 = new EasyLevel();

        List<Dungeon> dungeons = level1.getDungeons();

        boolean isCorrectInstance = true;
        for (Dungeon dungeon : dungeons) {
            if (!(dungeon instanceof EasyDungeon)) {
                isCorrectInstance = false;
            }
        }

        assertEquals(true, isCorrectInstance);
    }
}
