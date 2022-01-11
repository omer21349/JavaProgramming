package day15_ForLoop;

import java.util.Scanner;

public class SpacialCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String b="",
                letters="",
                digit="",
                spacial="";
        char s;
        String caracter= input.nextLine();
        for (int i = 0; i <= caracter.length()-1; i++) {
             s=caracter.charAt(i);

             if (s>='A'&&s<='Z'|| s>='a'&&s<='z'){
                 letters+=s;
            }else if(s>='0'&&s<='9'){
                 digit+=s;
            }else {
                 spacial+=s;
             }

        }System.out.println("letters: "+letters +"\n"+ "digits: "+digit+"\n"+"special chars: "+spacial);


        input.close();



    }
}

/*
write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */
