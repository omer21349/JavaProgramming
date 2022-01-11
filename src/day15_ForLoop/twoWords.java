package day15_ForLoop;

import java.util.Scanner;

public class twoWords {
    public static void main(String[] args) {
        System.out.println("enter two words");
        Scanner input= new Scanner(System.in);
        String firs= input.nextLine();
        String second= input.nextLine();

        System.out.println(firs.substring(1)+second.substring(1));

        input.close();


    }
}
/*
ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */