package day14_String;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence= input.nextLine();

        char s= sentence.charAt(0);
        char b= sentence.charAt(sentence.length()-1);

        System.out.println(s+"."+b);

        input.close();



    }
}

/*

write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */