package creational.factory_method;

public class EasyLevel extends LevelGenerator{
    @Override
    protected Dungeon makeDungeon() {
        return new EasyDungeon();
    }
}
