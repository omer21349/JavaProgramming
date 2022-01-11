package day16_FoorLoop_StringPractice;

import java.util.Scanner;

public class DublicateCarecter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a word");
        String word =input.nextLine();

        String result="";

        for (int i = 0; i <= word.length()-1; i++) {
           String a=""+word.charAt(i);

           if (!result.contains(a)){
                result+=a;
           }

    }System.out.print(result);


        input.close();



    }

}
/*

Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

 */
