package behavioral.memento;

public class Memento {

    private Memory memory;

    public Memento(Memory memory) {
        this.memory = memory;
    }

    public Memory getSavedMemory() {
        return memory;
    }
}
