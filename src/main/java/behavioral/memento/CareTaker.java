package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> savedStates = new ArrayList<>();
    private Originator originator = new Originator();

    public void add(Memory memory) {
        originator.set(memory);
        savedStates.add(originator.storeInMemento());
    }

    public Memento getMemento(int index) {
        return savedStates.get(index);
    }

}
