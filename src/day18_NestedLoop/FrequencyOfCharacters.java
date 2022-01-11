package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a word");
        String str= input.nextLine();


        String result="";
        for (int i = 0; i < str.length(); i++) {
            int num1 = 0;
            if (result.contains(""+str.charAt(i))) {
                continue;
            }result+=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    num1++;
                }
            }
                System.out.print(str.charAt(i)+ "" + num1);

        }
        input.close();
    }
}
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */