package structural.facade;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FacadeTest {

    private CharacterService service;

    @Before
    public void setUp() {
        service = new CharacterService();
    }

    @Test
    public void createCharacter_Should_Create_Character() {
        Character fairy = service.createCharacter("Fairy", 50);

        assertThat(fairy, instanceOf(Fairy.class));
    }

    @Test
    public void transfer_Should_Transfer_Resources_Between_Character() {
        Character fairy = service.createCharacter("Fairy", 50);
        Character warrior = service.createCharacter("Warrior", 50);
        service.transfer(fairy, warrior, 50);

        assertEquals(fairy.getQuantity(), 0);
        assertEquals(warrior.getQuantity(), 100);
    }
}
