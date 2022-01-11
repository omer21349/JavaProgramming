package day14_String;

import java.util.Scanner;

public class firstAndLastCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter name:");
        String name= input.nextLine();

        char first = name.charAt(0),
                second= name.charAt(name.length()-1);
        String result;
        if(first==second){
            result= "same";
        }
        else {
            result="not same";
        }
        System.out.println(result);

        input.close();




    }

}


/*

write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */
