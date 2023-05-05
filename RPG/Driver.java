/*
Jude Slade 
5/14/23
RPG
CPSC 1060
*/

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Driver {

    public static void main(String[] args) {
        
        //printing out the starting menu
        System.out.println("\nSearch the house for clues to solve the murder of Evan Kessler. To leave the house, please type exit to jump out of the nearest window.\n");

        /*
         * Create a scanner, put the inital room (entrance) to study
         * While the user's input is not exit, continue to traverse the map. 
         * If there is an invalid selection, then print out "Invalid exit."
         * After you are done selecting, print out "Please choose an exit" and get next exit
         */

        // Creating rooms used throughout the game
        Room basement = new Room("basement", "Need a little escape from all the action? Come downstairs");
        Room library = new Room("library", "Brush up on your Nietzsche and Kant");
        Room kitchen = new Room("kitchen", "Perfect place to make a tasty meal");
        Room guestRoom = new Room("guest room", "A room filled with numerous torture devices. Who said anything about welcome guests?");
        Room bathroom = new Room("bathroom", "Have you ever needed to relieve your self or bathe? This is the place for you");
        Room gameRoom = new Room("game room", "Shoot some pool, hit some ping pong, play some video games");
        Room bedroom = new Room("bedroom", "Bedtime baby");

        // Adding exits to rooms
        // SWTICH ALL OF THESE WORDS TO ACTION OBJECTS AFTER YOU CREATE CLASS ACTION
        // THINGS TO CHANGE TO "SEARCH FOR CLUES" "*ALL THE OTHER ROOMS*" ""
        basement.addExit("library");
        basement.addExit("kitchen");
        basement.addExit("guest room");
        basement.addExit("bathroom");
        basement.addExit("game room");
        basement.addExit("bedroom");

        library.addExit("basement");
        library.addExit("kitchen");
        library.addExit("guest room");
        library.addExit("bathroom");
        library.addExit("game room");
        library.addExit("bedroom");

        kitchen.addExit("basement");
        kitchen.addExit("library");
        kitchen.addExit("guest room");
        kitchen.addExit("bathroom");
        kitchen.addExit("game room");
        kitchen.addExit("bedroom");

        guestRoom.addExit("basement");
        guestRoom.addExit("library");
        guestRoom.addExit("kitchen");
        guestRoom.addExit("bathroom");
        guestRoom.addExit("game room");
        guestRoom.addExit("bedroom");

        bathroom.addExit("basement");
        bathroom.addExit("library");
        bathroom.addExit("kitchen");
        bathroom.addExit("guest room");
        bathroom.addExit("game room");
        bathroom.addExit("bedroom");

        gameRoom.addExit("basement");
        gameRoom.addExit("library");
        gameRoom.addExit("kitchen");
        gameRoom.addExit("guest room");
        gameRoom.addExit("bathroom");
        gameRoom.addExit("bedroom");

        bedroom.addExit("basement");
        bedroom.addExit("library");
        bedroom.addExit("kitchen");
        bedroom.addExit("guest room");
        bedroom.addExit("bathroom");
        bedroom.addExit("game room");


        // Creating adventure map and adding rooms to it
        AdventureMap map = new AdventureMap();
        map.addRoom(basement);
        map.addRoom(library);
        map.addRoom(kitchen);
        map.addRoom(guestRoom);
        map.addRoom(bathroom);
        map.addRoom(gameRoom);
        map.addRoom(bedroom);
        // This game is starting at the study
        Room currentRoom = bedroom;
        boolean exity = true;
        boolean bingo = true;
        Room tempRoom;
        String fileName = " ";
        Scanner scanner = new Scanner(System.in);
        //while loop to detect which room the user is located in
        while(exity) {
            System.out.println(currentRoom.toString());
            if (currentRoom == basement) {
                System.out.println("John");
                System.out.println("");
            }
            if (currentRoom == library) {
                System.out.println("Richie");
                System.out.println("");
            }
            if (currentRoom == kitchen) {
                System.out.println("Trent");
                System.out.println("");
            }
            if (currentRoom == guestRoom) {
                System.out.println("Lucas");
                System.out.println("");
            }
            if (currentRoom == bathroom) {
                System.out.println("Alex");
                System.out.println("");
            }
            if (currentRoom == gameRoom) {
                System.out.println("Collin");
                System.out.println("");
            }
            if (currentRoom == bedroom) {
                System.out.println("Mason");
                System.out.println("");
            }
            bingo = true;
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                break;
            }
            if (userInput.equals("John")) {
                System.out.println("FINE! You caught me. I killed him by looking up the best way on Chat GPT.");
                fileName = "game.txt";
                try {
                    FileOutputStream outputStream = new FileOutputStream(fileName);
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.println("Congratualtions you solved the murder of Evan Kessler!");
                    printWriter.close();
                }catch (Exception e){
                    System.out.println("Bad");
                }
                System.out.println("Congratualtions you solved the murder of Evan Kessler!");
                End end = new End();
                end.endGame();
                break;
            }
            if (userInput.equals("Richie")) {
                System.out.println("I'm really into Nietzsche's thoughts about the origins of 'bad conscience'. Oh a murder? I haven't heard anything but if I do I'll let you know.");
                bingo = false;
            }
            if (userInput.equals("Trent")) {
                System.out.println("Hey man I don't know anything no murder. I'm just sitting here minding my own business.");
                bingo = false;
            }
            if (userInput.equals("Lucas")) {
                System.out.println("YO ARE WE GETTING LIT THIS WEDNESDAY?!?! Oh sorry you're not Alex. Evan Kessler? Never heard of him.");
                bingo = false;
            }
            if (userInput.equals("Collin")) {
                System.out.println("Sorry man. I've been playing no limit Texas Hold'em with Jude and Matthew for the past 3 days.");
                bingo = false;
            }
            if (userInput.equals("Alex")) {
                System.out.println("I overheard someone in the basement bragging about how they killed Evan Kessler.");
                bingo = false;
            }
            if (userInput.equals("Mason")) {
                System.out.println("Sorry I'm locked in coding datingApp.java right now.");
                bingo = false;
            }
            if (userInput.equals("basement") || userInput.equals("library") || userInput.equals("kitchen") || userInput.equals("guest room") || userInput.equals("bathroom") || userInput.equals("game room") || userInput.equals("bedroom")) {
                bingo = false;
            }
            while (bingo) {
                System.out.println("invalid input");
                userInput = scanner.nextLine();
                if (userInput.equals("basement") || userInput.equals("library") || userInput.equals("kitchen") || userInput.equals("guest room") || userInput.equals("bathroom") || userInput.equals("game room") || userInput.equals("bedroom")) {
                bingo = false;
                }
            }
            if (userInput.equals("John") || userInput.equals("Richie") || userInput.equals("Trent") || userInput.equals("Lucas") || userInput.equals("Collin") || userInput.equals("Alex") || userInput.equals("Mason")) {
                tempRoom = currentRoom;
            }
            else {
                currentRoom = map.getRoom(userInput.toLowerCase());
            }
        }
        //closing the scanner to prevent errors
        scanner.close();
    }
}


