package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String word ="Today is a good day to learn Java";

        String word2[]=word.split(" ");
         String reverse="";
        for (int i = word2.length - 1; i >= 0; i--) {
            reverse +=word2[i]+" ";
        }
        System.out.println(reverse);






    }
}
/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today

 */