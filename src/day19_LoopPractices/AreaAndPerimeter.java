package day19_LoopPractices;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       while (true) {
           System.out.println("Enter the radius of the circle:");
           int radius = input.nextInt();
           input.nextLine();
           if (radius <= 0) {
               System.err.println("Invalid Entry for the radius of the circle");
               System.exit(0);
           }double area = 3.14 * radius * radius,
                   perimeter = 2 * 3.14 * radius,
                   diameter=2*radius;



           System.out.println("Diameter of circle: "+diameter+"\n"+"Area of the circle: " + area + "\n" + "perimeter of the circle: " + perimeter);
           System.out.println("Would you like the calculate another circle");
           String option = input.nextLine();
           while (!(option.equalsIgnoreCase("yes")||option.equalsIgnoreCase("no"))) {
               System.err.println("wrong answer. pleas re enter yes or no");
               option = input.nextLine();
           }
           if (option.equalsIgnoreCase("no")){
               System.out.println("Thank you for using Cydeo Circle Calculator APP");
               break;
           }

       }
        input.close();
    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
