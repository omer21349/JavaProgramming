package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word:");

        String word=input.next();

        if(word.charAt(0)=='x'){
          word=word.replaceFirst("x","a");
        }
        System.out.println(word);

        input.close();


    }
}

/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
