package creational.factory;

public class Factory {
    public static Human createHuman(String type) {
        switch (type) {
            case Human.MAN:
                return new Man();
            case Human.WOMAN:
                return new Woman();
            default:
                return null;
        }
    }
}
