package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        System.out.println("Enter cent: ");
        int cent= input.nextInt(), centToDollar=cent/100, coin=cent%100;

        System.out.println(cent+" cents equal to: "+centToDollar+ " dollars and "+coin+" cents.");

        input.close();




    }

}


/*

Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */
