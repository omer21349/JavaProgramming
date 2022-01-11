package day18_NestedLoop;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("enter a number:");
            int num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("would you like enter another number?");
            String a = input.next().toLowerCase();

            //while (){
                System.out.println("please re enter,would you like enter another number?");
            }

            //if (a.equals("no")){
              //  break;


            }

        }




/*

Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps
 */
