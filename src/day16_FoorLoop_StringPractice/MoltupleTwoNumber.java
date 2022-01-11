package day16_FoorLoop_StringPractice;

import java.util.Scanner;

public class MoltupleTwoNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter two pozitive number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3=0;
        for (int i = 0; i < num2; i++) {

            if(num1>0&& num2>0) {
            num3 += num1;
            }else {
                System.out.println("invalid");
            }
        }System.out.println(num3);

        input.close();



    }
}

/*
Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */
