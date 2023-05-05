/*
Jude Slade 
5/14/23
RPG
CPSC 1060
*/

import java.util.ArrayList;

public class Room {
    //different variables used throughout the method
    String name;
    String description;
    ArrayList<String> exits;
    
    /**
     * Initialize a room
     * @param name the name of the room
     * @param description the description of the room
     */
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        exits = new ArrayList<>();
    }

    /**
     * Get the name of the room
     * @return the name of the room
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the room
     * @param name the new name of the room
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description of the room
     * @return the description of the room
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the room
     * @param description the new description of the room
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Adds an exit to the room
     * @param exit room name of the exit to be added to the room
     */
    public void addExit(String exit) {
        exits.add(exit);
    }

    /**
     * List all of the rooms as a string
     * @return returns all of the names of the rooms on new lines
     */
    //method for listing the exits the user can use
    public String listExits() {
        String result = "";
        for (String exit : exits) {
            result += exit + "\n";
        }
    return result;
}

    //returning the exits and description of the room the user is located in
    public String toString() {
    String exits = listExits();
    return  name + ": " + description + "\n" +
           "Exits: \n" + exits + "\n" +
           "Please choose an exit or talk to someone\n";
    }
}