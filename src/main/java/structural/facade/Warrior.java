package structural.facade;

public class Warrior implements Character {

    private int force;

    public Warrior(int force) {
        this.force = force;
    }

    @Override
    public void up(int quantity) {
        force = force + quantity;
    }

    @Override
    public boolean down(int quantity) {
        if(force - quantity >= 0) {
            force = force - quantity;
            return true;
        }
        return false;
    }

    @Override
    public int getQuantity() {
        return force;
    }


}
