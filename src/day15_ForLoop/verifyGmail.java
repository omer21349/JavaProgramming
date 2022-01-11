package day15_ForLoop;

import java.util.Scanner;

public class verifyGmail {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a email");
        String email=input.nextLine();
        String result;

        if(email.endsWith("@gmail.com")){

            result="its a valid email";
        }else
            result="its not a valid email";
        System.out.println(result);
        input.close();

    }
}
/*
write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.c
 */
