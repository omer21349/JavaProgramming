package day15_ForLoop;

import java.util.Scanner;

public class enterWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println(word.substring(1));

        input.close();



    }
}

/*
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */
