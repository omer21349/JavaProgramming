package day20_Arrays;

import java.util.Scanner;

public class NameOfMonths {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a mount");
        int num=input.nextInt();

        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

        if (num<1||num>7){
            System.exit(0);
        }
        System.out.println(months[num-1]);

        input.close();

    }
}
