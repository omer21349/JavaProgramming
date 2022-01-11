package day14_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter first String:");
        String name1 =input.nextLine();

        System.out.println("Enter second String:");
        String name2 =input.nextLine();

        int a =name1.length();
        int b = name2.length();

        if (a>b){
            System.out.println(name1);
        }
        else {
            System.out.println(name2);
        }

        input.close();










    }
}
/*
write a program that asks user to enter two strings, and print out the longest string
 */