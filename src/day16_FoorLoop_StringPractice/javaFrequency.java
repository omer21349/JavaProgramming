package day16_FoorLoop_StringPractice;

public class javaFrequency {
    public static void main(String[] args) {
        String word = "java java jshadh java kjajfkadh";
        int ferequence=0;

        for (int i = 0; i <= word.length()-4; i++) {

            if (word.substring(i,i+4).equalsIgnoreCase("java")){
                ferequence++;
            }
        }
        System.out.println(ferequence);


    }
}
/*

write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */