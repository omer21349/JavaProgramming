package day15_ForLoop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter a word");
        String word= input.nextLine();
        String a="",
                d="";
        boolean b;
        for (int i =word.length()-1 ; i>=0; i--) {
            d +=word.charAt(i);

        }b= word.equalsIgnoreCase(d);
        System.out.println(b);

        
        
    }

}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */