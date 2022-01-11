package day19_LoopPractices;

import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your score");
            int score = input.nextInt();
            input.nextLine();
            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry");
            }
            String result = "";

            if (score >= 90) {
                result = "Your Score is A";
            } else if (score >= 80) {
                result = "Your Score is B";
            } else if (score >= 70) {
                result = "Your Score is C";
            } else if (score >= 60) {
                result = "Your Score is D";
            } else {
                result = "Your Score is F";
            }
            System.out.println(result);

            System.out.println("Would you like the to continue");
            String conti = input.nextLine();
            while (!(conti.equalsIgnoreCase("yes") || conti.equalsIgnoreCase("no"))) {
                System.out.println("invalid answer please answer yes or no");
                conti = input.nextLine();
            }
            if (conti.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                 break;
            }
        }

        input.close();




    }
}
/*
Write a program for grade calculator:
			1. Ask the user "Enter your score"
				If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F

			2. Ask the user would you like to continue
				If "yes" --> repeat the previous steps
				If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


 */
