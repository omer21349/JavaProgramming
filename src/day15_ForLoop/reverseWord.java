package day15_ForLoop;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word =input.nextLine();
        char a;
        for (int i = word.length()-1; i >=0; i--) {
        a= word.charAt(i);
        System.out.print(a);


        }




    }

}
/*
Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */