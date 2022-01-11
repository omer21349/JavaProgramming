package day18_NestedLoop;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){

            System.out.println("please enter first number");
            int num1 = input.nextInt();
            while (!(num1>-2147483648&&num1<2147483647)){
                System.err.println("invalid number. please re enter again");
                num1 = input.nextInt();
            }
            System.out.println("Please enter a math operator");
            int oparator= input.next().charAt(0);
            while (!(oparator=='+'||oparator=='-'||oparator=='*'||oparator=='/')){
                System.err.println("invalid operator. Please enter a valid operator");
                oparator= input.next().charAt(0);
            }System.out.println("please enter second number");
            int num2 = input.nextInt();
            while (!(num2>-2147483648&&num2<2147483647)){
                System.err.println("invalid number. please re enter again");
                num2 = input.nextInt();
            }
            System.out.println("Would you like to continue");
            input.nextLine();
            String contin= input.next();
            while (!(contin.equalsIgnoreCase("yes")||contin.equalsIgnoreCase("no"))){
                System.err.println("invalid answer. please re enter again");
                contin= input.next();
            }
            int result=0;
            if(oparator=='+'){
                result=num1+num2;
            }else if(oparator=='-'){
                result=num1-num2;
            }else if(oparator=='*') {
                result = num1 * num2;
            }else {
                result= num1 / num2;
            }
            if (contin.equalsIgnoreCase("yes")){
                System.out.println("total number is: "+result);
            }else {
                System.out.println("total number is: "+result+"\n"+"good bye");
                break;
            }


        }
        input.close();
    }
}
/*
Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry

 */
