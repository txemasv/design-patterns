package creational.prototype;

public class Room implements Cloneable {

    private String number;
    private int toilets;
    private int kitchens;
    private int beds;

    public Room(String number, int toilets, int kitchens, int beds) {
        this.number = number;
        this.toilets = toilets;
        this.kitchens = kitchens;
        this.beds = beds;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public int getKitchens() {
        return kitchens;
    }

    public void setKitchens(int kitchens) {
        this.kitchens = kitchens;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }
}
