package day12_Scanner;

import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter the mile:");
        int mile= input.nextInt();



        double mileToKm= mile*1.609344;

        System.out.println(mile+ " mile= "+mileToKm+" km" );

        input.close();



    }
}

/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
 */
