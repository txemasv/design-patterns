package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private static Map<String, Room> rooms = new HashMap<>();

    public static Map<String, Room> createRoom(String number, Room roomType) throws CloneNotSupportedException {
        rooms.put(number, (Room) roomType.clone());
        return rooms;
    }

    public static Map<String, Room> getRooms() {
        return rooms;
    }

}
