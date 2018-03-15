package behavioral.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MementoTest {

    @Test
    public void restoreMemento_Should_Return_BackState_Of_Memory() {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        int current = 0;

        Memory myMemory1 = new Memory("6th anniversary", "I had a party with my friends and they offer me 'The Steadfast Tin Soldier' book.");
        originator.setMemory(myMemory1);
        careTaker.addMemento(originator.storeInMemento());

        Memory myMemory2 = new Memory("first kiss", "When I was 11 a girl of my school kiss me, I felt so happy.");
        originator.setMemory(myMemory2);
        careTaker.addMemento(originator.storeInMemento());

        Memory savedMemory = originator.restoreFromMemento(careTaker.getMemento(undo(current)));

        assertEquals(myMemory1, savedMemory);
    }

    private int undo(int current) {
        if (current > 0) current--;
        return current;
    }
}
