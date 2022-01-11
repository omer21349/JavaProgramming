package day24_CustomMethods_Return;

import java.util.Arrays;
import java.util.Locale;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String t="Java java java python python";
        String h="java";
        System.out.println(frequencyOfWord(t,h));
    }

    public static int frequencyOfWord(String sentence,String word){
       String y= sentence.toLowerCase();
       String g=word.toLowerCase();
       int count=0;
        String a[]= y.split(" ");
        for (String s : a) {
            if(s.contains(g)){
                count++;
            }
        } return count;
    }


}
/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */
