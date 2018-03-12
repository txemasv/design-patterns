package creational.prototype;

public class Room implements Cloneable {

    private int toilets;
    private int kitchens;
    private int beds;

    public Room(int toilets, int kitchens, int beds) {
        this.toilets = toilets;
        this.kitchens = kitchens;
        this.beds = beds;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getToilets() {
        return toilets;
    }

    public int getKitchens() {
        return kitchens;
    }

    public int getBeds() {
        return beds;
    }
}
