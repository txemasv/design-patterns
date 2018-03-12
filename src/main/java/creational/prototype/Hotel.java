package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Hotel {

    private static Map<String, Room> rooms = new HashMap<>();

    public static void createRoom(String number, Room roomType) throws CloneNotSupportedException {
        rooms.put(number, (Room) roomType.clone());
    }

    public static Map<String, Room> getRooms() {
        return rooms;
    }

}
