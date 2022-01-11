package day19_LoopPractices;

import java.util.Scanner;

public class FirstDuplicatedCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String word=input.nextLine();
          String result="";

        for (int i = 0; i < word.length(); i++) {
            char a=word.charAt(i);
            int count=0;
            for (int j = 0; j < word.length(); j++) {
                 char b =word.charAt(j);
                if (b==a){
                    count++;
            }


        }
            if (count>1) {
                result += a;
                break;
            }
        }


        System.out.println(result);
        input.close();

    }
}
/*
 Write a program that can return the first duplicated character from a string
 */
