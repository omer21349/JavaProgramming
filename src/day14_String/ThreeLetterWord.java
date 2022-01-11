package day14_String;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter three letter word:");
        String word= input.nextLine();
        String b;

        if (word.length()==3&&word.charAt(1)=='a'){
            b="cool name";
        }else if (word.length()==3&&word.charAt(1)!='a'){
            b="good name";
        }
        else if(word.length()<3){
            b="Word is too short";
        }else{
            b="Word is too long";
        }
        System.out.println(b);

        input.close();
    }


}

/*
write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */
