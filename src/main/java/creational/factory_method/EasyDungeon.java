package creational.factory_method;

public class EasyDungeon implements Dungeon {

    private Dungeon next;

    @Override
    public void setNext(Dungeon dungeon) {
        this.next = dungeon;
    }

    @Override
    public Dungeon getNext() {
        return next;
    }
}