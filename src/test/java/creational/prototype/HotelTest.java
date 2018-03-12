package creational.prototype;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    @Test
    public void dummy() throws CloneNotSupportedException {

        Room roomModel = new Room("1", 0, 0, 1);

        Hotel.createRoom("2", roomModel);
        Hotel.createRoom("3", roomModel);
        Hotel.createRoom("4", roomModel);

        Map rooms = Hotel.getRooms();

        assertEquals(3, rooms.size());
    }
}
