package day17_While_DoWhile;

import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num= input.nextInt();
        int a=0;
        while (num>=0){
            System.out.println("Please enter a number:");
            num= input.nextInt();
            a=a+num;


        } System.out.println(a);
        input.close();


    }
}

/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */
