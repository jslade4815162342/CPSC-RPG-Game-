/*
Jude Slade 
5/14/23
RPG
CPSC 1060
*/

import java.util.HashMap;

public class AdventureMap {
    HashMap<String, Room> map;

    public AdventureMap() {
        map = new HashMap<>();
    }

    /**
     * Adds a room to the AdventureMap
     * The name associated with the room must be lowercase
     *
     * @param room Room to be added to the AdventureMap
     */
    public void addRoom(Room room) {
        map.put(room.getName().toLowerCase(), room);
    }

    /**
     * Returns the Room associated with the string name given
     *
     * @param roomName the name of the room to be returned, room name must be valid
     * @return the Room object associated with the name, the name will be in lowercase
     */
    public Room getRoom(String roomName) {
        return map.get(roomName.toLowerCase());
    }
}