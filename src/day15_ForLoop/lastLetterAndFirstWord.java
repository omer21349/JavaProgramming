package day15_ForLoop;

import java.util.Scanner;

public class lastLetterAndFirstWord {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter two word");
        String word1=input.nextLine();
        String word2= input.nextLine();
        String a= word1.substring(word1.length()-1),
                b=word2.substring(0,1);
        String result;
        if(a.equals(b)){
           result=word1+word2.substring(1) ;
        }else{
            result=word1+word2;
        }
        System.out.println(result);

        input.close();




    }


}

/*
Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
