package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String word = "I Love Java";

        String word2[] = word.split(" ");

        String reverse="";

        for (int i = word2[1].length()-1; i >= 0; i--) {
                 reverse+=word2[1].charAt(i);
        }

        //word=word.replaceFirst(word2[1],reverse);

      //  System.out.println(word);  //bu birinci yol.

        System.out.println("----------------------------------------");

        word2[1]=reverse;

        for (String s : word2) {
            System.out.print(s+" ");
        }



    }
}
/*
 Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */