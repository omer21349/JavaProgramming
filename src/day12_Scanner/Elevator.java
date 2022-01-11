package day12_Scanner;

public class Elevator {
    public static void main(String[] args){
        int floorNumber=6;
        String b;

        if(floorNumber==1||floorNumber==2||floorNumber==3){
            if(floorNumber==1){
                b="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            }
            else if(floorNumber==2){
                b="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
            }
            else {
                b="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }
        else{
            b="Invalid floor "+"- "+floorNumber;
        }
        System.out.println(b);

        System.out.println("------------------------------------------------------------");

        int floor=3;
        String a;

        if (floor==1||floor==2||floor==3){
            switch (floor){
                case 1:
                    a="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    a="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    a="Floor 3 selected. Companies: Lyft, BofA, Stake house";

            }
        }
        else {
            a="Invalid floor "+"- "+floor ;
        }
        System.out.println(a);


    }
}


/*
Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */