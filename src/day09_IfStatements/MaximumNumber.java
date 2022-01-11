package day09_IfStatements;

public class MaximumNumber {
    public static void main(String[] args){

        int a = 200;
        int b = 100;

        if(a>b){
            System.out.println(a);
        }
        if(b>a){
            System.out.println(b);
        }
        if(b==a)
            System.out.println("Equal");


    }
}



/*
Write a program that can print the maximum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                200 is the maximum number
 */