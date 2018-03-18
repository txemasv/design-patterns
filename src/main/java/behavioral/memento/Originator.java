package behavioral.memento;

public class Originator {

    private Memory memory;

    public Memento storeInMemento() {
        return new Memento(memory);
    }

    public Memory restoreFromMemento(Memento memento) {
        memory = memento.getSavedMemory();
        return memory;
    }

    public void set(Memory memory) {
        this.memory = memory;
    }
}
