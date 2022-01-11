package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        String a = word.replaceFirst("x", "a") ;

        System.out.println(a);

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Enter a word");
        String woro2 = input.nextLine();
        woro2=woro2.toLowerCase();

        String a2 =woro2.replace("x", "a");

        System.out.println(a2);
        input.close();
    }
}

/*
1)  Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 2)Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea



 */


