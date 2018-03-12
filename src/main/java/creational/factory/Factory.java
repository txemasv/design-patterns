package creational.factory;

public class Factory {
    public static Human createHuman(String type) {
        switch (type) {
            case Human.MAN:
                return new Man('x');
            case Human.WOMAN:
                return new Woman('x', 'y');
            default:
                return null;
        }
    }
}
