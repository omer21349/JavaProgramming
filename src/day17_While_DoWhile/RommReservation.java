package day17_While_DoWhile;

import java.util.Scanner;

public class RommReservation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Would you like to reserve a room?");
        String word=input.nextLine();
        while (!(word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no"))){
            System.out.println("invalid entry. Please re enter");
            word=input.nextLine();
        }if(word.equalsIgnoreCase("yes")){
            System.out.println("which type of room would you like to reserve.");
            String word2=input.nextLine();
            while (!(word2.equalsIgnoreCase("King Bed")||word2.equalsIgnoreCase("Queen Bed")||word2.equalsIgnoreCase("single Bed"))){
                System.out.println("invalid room, reselect the room until");
                word2=input.nextLine();
            }
            if (word2.equalsIgnoreCase("King Bed")){
                System.out.println("King Bed ==> 120$");
            }else if (word2.equalsIgnoreCase("Queen Bed")) {
                System.out.println("King Bed ==> 120$");
            }else if (word2.equalsIgnoreCase("single Bed")) {
                System.out.println("single Bed ==> 80$");
            }
        }else {
            System.out.println("Good bye.");
        }
        input.close();

    }
}
/*
Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */
