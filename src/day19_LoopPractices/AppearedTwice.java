package day19_LoopPractices;

import java.util.Scanner;

public class AppearedTwice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String word=input.nextLine();

        String result="";

        for (int i = 0; i < word.length(); i++) {
            int count=0;
            char a=word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char b=word.charAt(j);
                if(a==b){
                    count++;
                }
            }
            if (count==2){
                result+=a;
            }

        }
        System.out.println(result);

        input.close();

    }
}
/*
Write a program that can display all the characters that appeared twice in the string.
 */