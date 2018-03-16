package creational.factory;

public class Man implements Human {
    private char gen;

    public Man() {
        this.gen = 'x';
    }

    @Override
    public String getGenes() {
        return (Character.toString(gen) + Character.toString(gen)).toUpperCase();
    }
}
