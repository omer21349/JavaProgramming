package day15_ForLoop;

import java.util.Scanner;

public class calledEmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an email");
        String email= input.nextLine();

        if(email.contains("_")){
           String s= email.substring(email.indexOf("_")+1,email.lastIndexOf("@"));
           String s1=email.substring(0,email.lastIndexOf("_"));
           String s2=email.substring(email.indexOf("@"));
           System.out.println(s+"_"+s1+s2);

       }else {
           System.out.println(email);
        }
        input.close();




    }
}
/*
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Saperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */
