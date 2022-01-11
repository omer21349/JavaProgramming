package day15_ForLoop;

import java.util.Scanner;

public class question_SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit and word:");
        String word=input.nextLine();
        char num;
        int b=0;
        for (int i = 0; i <= word.length()-1; i++) {
            num=word.charAt(i);

            if(num>='1'&&num<='9'){
                b+=num -'0';

            }

        }System.out.print(b);
        input.close();
    }


}

/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
 */
