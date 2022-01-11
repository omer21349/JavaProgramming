package day19_LoopPractices;

import java.util.Scanner;

public class IndexFirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word= input.nextLine();
        String result="";

        for (int i = 0; i < word.length(); i++) {
            int count=0;
            char a = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char b = word.charAt(j);
                if(a==b){
                    count++;
                }
            }if(count==1){
                result+=a;
                break;
            }

        }


        System.out.println(result);
        input.close();

    }
}
/*
Write a program that can return the index number of the first unique character.
 */
