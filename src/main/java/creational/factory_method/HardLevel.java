package creational.factory_method;

public class HardLevel extends LevelGenerator {
    @Override
    protected Dungeon makeDungeon() {
        return new HardDungeon();
    }
}
