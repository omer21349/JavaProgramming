package day14_String;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first name");
        String name= input.nextLine();

        System.out.println("Enter your last name");
        String name2= input.nextLine();

        char fist= name.charAt(0), second= name2.charAt(0);

        System.out.println(fist+"."+second);
        input.close();


    }
}

/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */