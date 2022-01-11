package day17_While_DoWhile;

import java.util.Scanner;

public class witoutDivisionMultiplication {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter number");
        int num1=input.nextInt();
        System.out.println("please enter number");
        int num2=input.nextInt();
        //System.out.println("enter a oparator");
        int division =0;
        int maltipulation=0;
        String oparator="";// input.next().charAt(0);
        for (int i = 0; i < num2; i++) {
            maltipulation += num1;
            while (num1>=num2) {
                num1-=num2;
                division++;
            }
        } System.out.println(maltipulation);
        System.out.println(division);

        input.close();

    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */