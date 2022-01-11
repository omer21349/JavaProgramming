package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("how many number would you like the enter?");
        int num=input.nextInt();

        int num2[]= new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("enter a number");
            num2[i] =input.nextInt();

        }System.out.println(Arrays.toString(num2));





    }
}
