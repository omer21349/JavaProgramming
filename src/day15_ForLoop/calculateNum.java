package day15_ForLoop;

import java.util.Scanner;

public class calculateNum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = input.nextInt();
        int b=0;
        for (int i = 0; i <=a ; i++) {
               b+= i;
        }
        System.out.println(b);
        input.close();


    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */