package structural.facade;

public class Druid implements Character {

    private int food;

    public Druid(int food) {
        this.food = food;
    }

    @Override
    public void up(int quantity) {
        food = food + quantity;
    }

    @Override
    public boolean down(int quantity) {
        if(food - quantity >= 0) {
            food = food - quantity;
            return true;
        }
        return false;
    }

    @Override
    public int getQuantity() {
        return food;
    }


}
