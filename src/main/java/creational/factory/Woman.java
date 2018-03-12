package creational.factory;

public class Woman implements Human {
    private char genA;
    private char genB;

    public Woman(char genA, char genB) {
        this.genA = genA;
        this.genB = genB;
    }

    @Override
    public String getGenes() {
        return (Character.toString(genA) + Character.toString(genB)).toUpperCase();
    }
}