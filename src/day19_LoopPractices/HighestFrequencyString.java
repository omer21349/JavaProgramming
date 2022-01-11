package day19_LoopPractices;

import java.util.Scanner;

public class HighestFrequencyString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence");
        String word= input.nextLine();
         String result="";
         int bigeer=0;
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char a = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char b = word.charAt(j);
                if (a == b) {
                    ++count;
                }
            }
            if (count>bigeer){
                bigeer=count;
                result=a+"";

            }

        }
        System.out.println(result);
        input.close();
    }

}



/*
Write a program that can find the character that has the highest frequency from a string
 */
