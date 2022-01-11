package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a first name");
        String fullName= input.nextLine();

        System.out.println("Enter last name");
        String lastName= input.nextLine();

        fullName= fullName.substring(0,1).toUpperCase()+fullName.substring(1).toLowerCase();
        lastName= lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("firstName= "+fullName+"\n"+"lastName = "+lastName);

        input.close();





    }
}

/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName= "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */


