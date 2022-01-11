package day15_ForLoop;

import java.util.Locale;

public class FormatFullname {
    public static void main(String[] args) {
        String firstName="cyDeo",
                lastName="SCHOOL";

        //firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();//
        // ikinci yontem

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstName+" "+lastName);

    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
