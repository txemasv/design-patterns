package creational.prototype;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void createRoom_Should_Create_A_Prototyped_Room() throws CloneNotSupportedException {

        Room roomModel = new Room(0, 0, 1);

        Hotel.createRoom("201", roomModel);

        Map rooms = Hotel.getRooms();
        Room prototypedRoom = (Room) rooms.get("201");

        assertEquals(roomModel.getBeds(), prototypedRoom.getBeds());
        assertEquals(roomModel.getKitchens(), prototypedRoom.getKitchens());
        assertEquals(roomModel.getToilets(), prototypedRoom.getToilets());
    }
}
