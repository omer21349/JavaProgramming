package day20_Arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many number would you like the enter.");
        int num= input.nextInt();

        int limit[]= new int[num];
         double avarage=0;
         double sum=0;
        for (int i = 0; i < num; i++) {
            System.out.println("enter number please");
            limit[i]=input.nextInt();
            sum +=limit[i];
             avarage=sum/num;
        }
        System.out.println(Arrays.toString(limit));
        System.out.println(avarage);


    }
}
