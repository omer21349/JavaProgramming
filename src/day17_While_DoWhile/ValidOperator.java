package day17_While_DoWhile;

import java.util.Scanner;

public class ValidOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1= input.nextInt();
        System.out.println("Please enter a number");
        int num2= input.nextInt();
        System.out.println("enter a oparator");
        int oparator=input.next().charAt(0);
        while(!(oparator=='+'||oparator=='-'||oparator=='*'||oparator=='/')){
            System.out.println("invalid operator, Please re-enter the operator");
            oparator=input.next().charAt(0);
        }if(oparator=='+'){
            System.out.println(num1+num2);
        }else if(oparator=='-') {
            System.out.println(num1 - num2);
        }else if(oparator=='*') {
            System.out.println(num1 * num2);
        }else{
            System.out.println(num1 / num2);
        }


        input.close();


    }

}
/*
write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
