package day14_String;

import java.util.Scanner;

public class toReverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word");
        String word= input.nextLine();

        if(word.length()<5){
            System.out.println("Too short!");
        }else if(word.length()>5){
            System.out.println("Too long!");
        }else{
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));

        }
        input.close();

    }

}
