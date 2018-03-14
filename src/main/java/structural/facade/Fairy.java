package structural.facade;

public class Fairy implements Character {

    private int energy;

    public Fairy(int energy) {
        this.energy = energy;
    }

    @Override
    public void up(int quantity) {
        energy = energy + quantity;
    }

    @Override
    public boolean down(int quantity) {
        if(energy - quantity >= 0) {
            energy = energy - quantity;
            return true;
        }
        return false;
    }

    @Override
    public int getQuantity() {
        return energy;
    }
}