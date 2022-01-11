package day15_ForLoop;

import java.util.Scanner;

public class factorialNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=input.nextInt();
        int a=1;
        for (int i =num; 0<i; i--) {
             a*=i;


            }System.out.println(a);
        input.close();


        }


}

/*
Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
