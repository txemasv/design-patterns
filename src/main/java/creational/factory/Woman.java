package creational.factory;

public class Woman implements Human {
    private char genA;
    private char genB;

    public Woman() {
        this.genA = 'x';
        this.genB = 'y';
    }

    @Override
    public String getGenes() {
        return (Character.toString(genA) + Character.toString(genB)).toUpperCase();
    }
}