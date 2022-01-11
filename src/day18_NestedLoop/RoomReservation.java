package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        while (true) {
            System.out.println("Which bedroom do you want to reserve?");
            String room = input.nextLine();
            while (!(room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") || room.equalsIgnoreCase("single"))) {
                System.err.println("invalid room, please re enter again");
                room = input.nextLine();
            }
            System.out.println("How many nigt do you wat to stay?");
            int night = input.nextInt();
            input.nextLine();
            while (!(night > 0)) {
                System.err.println("invalid number please re enter again.");
                night = input.nextInt();
            }
            System.out.println("Would you like the reserve another room ");
            String anotherRoom = input.nextLine();
            while (!(anotherRoom.equalsIgnoreCase("yes") || anotherRoom.equalsIgnoreCase("no"))) {
                System.err.println("invalid answer please re enter again. would you like the reserve another room?");
                anotherRoom = input.nextLine();
            }
            int totalPrice=0;
            int isRoom = 0;
            if (room.equalsIgnoreCase("king bed")) {
                isRoom = 120;
            } else if (room.equalsIgnoreCase("queen bed")) {
                isRoom = 100;
            } else {
                isRoom = 80;
            }total+=isRoom*night;




            if(anotherRoom.equalsIgnoreCase("no")) {
                break;
            }




            }System.out.println("total room price for is " + total+ "$");

        input.close();
    }
}

/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */
