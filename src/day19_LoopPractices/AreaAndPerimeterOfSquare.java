package day19_LoopPractices;

import java.util.Scanner;

public class AreaAndPerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            int side= input.nextInt();
            input.nextLine();
            if (side<=0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            double are= side*side,
                    piramiter=4*side;
            System.out.println("Area of square: "+are+"\n"+"Perimeter of square:"+piramiter);

            System.out.println("would you like the calculate another square");
            String option=input.nextLine();
            while (!(option.equalsIgnoreCase("yes")||option.equalsIgnoreCase("no"))){
                System.out.println("Invalid answer please enter valid answer yes or no:");
                option=input.nextLine();
            }if(option.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }


        }
        input.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

 */
