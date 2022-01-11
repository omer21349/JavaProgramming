package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your email address");
        String email= input.nextLine();

        String a =email.substring(0,email.lastIndexOf("_"));
        String b= email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String c= email.substring(email.indexOf("@")+1,email.indexOf("."));
        String a1= a.substring(0,1).toUpperCase()+a.substring(1).toLowerCase();
        String b1= b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase();
        String c1=c.substring(0,1).toUpperCase()+c.substring(1).toLowerCase();
        System.out.println("First name: "+a1+"\n"+"Last name: "+b1+"\n"+"Domain: "+c1);


        input.close();




    }
}

/*
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

 */