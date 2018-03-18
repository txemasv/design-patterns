package behavioral.memento;

public class Memento {

    private Memory memory;

    public Memento(Memory memoryToSave) {
        this.memory = memoryToSave;
    }

    public Memory getSavedMemory() {
        return memory;
    }
}
