package day16_FoorLoop_StringPractice;

import java.util.Scanner;

public class UniqueCarecter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
        String result="";

        for (int i = 0; i < word.length(); i++) {
            char a= word.charAt(i);
            if (word.indexOf(a)==word.lastIndexOf(a)) {
                result+=a;

            }
        }System.out.print(result);

        input.close();


    }
}





/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique

 */
