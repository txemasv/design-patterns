package behavioral.memento;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MementoTest {

    @Test
    public void restoreMemento_Should_Return_BackState_Of_Memory() {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        int current = -1;

        Memory myMemory1 = new Memory("6th anniversary", "I had a party with my friends and they ...");
        careTaker.add(myMemory1);
        current++;

        Memory myMemory2 = new Memory("first kiss", "I was 11 and a girl of my school ...");
        careTaker.add(myMemory2);
        current++;

        Memory savedMemory = originator.restoreFromMemento(careTaker.getMemento(--current));

        assertEquals(myMemory1, savedMemory);
    }

}
