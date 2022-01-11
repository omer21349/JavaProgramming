package day15_ForLoop;

import java.util.Scanner;

public class wordLy {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.nextLine();
        String b=word.substring(word.length()-2);

        String result;
        if (b.equals("ly")){
            result="really???";
        }else{
            result="never mind";
        }
        System.out.println(result);
        input.close();
    }

}

/*
ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
