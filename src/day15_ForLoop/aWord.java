package day15_ForLoop;

import java.util.Scanner;

public class aWord {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        char a = word.charAt(0);
        boolean b= a<=48||a<=57,
                b2=a<=97||a<=122,
                b3=a<=65||a<=90;
        String a1;
        if(b){
            System.out.println("first character is digit");
        }else if(b2){
            System.out.println("first character is lowercase letter");
        }else if(b3){
            System.out.println("first character is uppercase letter");
        }else {
            System.out.println("first character is special character");
        }

        input.close();




    }
}
/*
Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */