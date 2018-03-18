package creational.factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract class LevelGenerator {

    private final List<Dungeon> dungeons = new ArrayList<>();

    public LevelGenerator() {
        Dungeon dungeonA = makeDungeon();
        Dungeon dungeonB = makeDungeon();
        Dungeon dungeonC = makeDungeon();
        Dungeon dungeonFinal = makeDungeon();

        dungeonA.setNext(dungeonB);
        dungeonB.setNext(dungeonC);
        dungeonC.setNext(dungeonFinal);

        dungeons.add(dungeonA);
        dungeons.add(dungeonB);
        dungeons.add(dungeonC);
        dungeons.add(dungeonFinal);
    }

    abstract protected Dungeon makeDungeon();

    public List<Dungeon> getDungeons() {
        return dungeons;
    }
}
