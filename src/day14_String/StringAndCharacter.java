package day14_String;

import java.util.Scanner;

public class StringAndCharacter {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter a character");
        String character = input.nextLine();

        char a= character.charAt(character.length()-3),
                b= character.charAt(character.length()-2),
                c=character.charAt(character.length()-1);


        if(character.length()<3){
            System.out.println(character);
        }else if(character.length()==0){
            System.out.println("string is empty");
        }else {
            System.out.println(a+""+b+""+c);

        }
        input.close();



    }
}

/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */
