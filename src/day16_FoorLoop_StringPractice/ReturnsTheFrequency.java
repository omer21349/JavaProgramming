package day16_FoorLoop_StringPractice;

import java.util.Scanner;

public class ReturnsTheFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String words = input.nextLine();
        System.out.println("enter a char");
        String ch = input.nextLine();
        int count=0;
        for ( int i = 0; i <words.length(); i++) {
            String a=""+words.charAt(i);

            if(a.equals(ch)){
                count++;
            }
        }
        System.out.println(count);
        input.close();

    }

}
/*

Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
