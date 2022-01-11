package day09_IfStatements;

public class MinNumber {
    public static void main(String[]args){

        int num= 1400,
                num2=250;
        boolean a = num<num2;
        boolean b = num>num2;
        boolean c = num==num2;
        if(a){
            System.out.println(num);
        }
        if (b){
            System.out.println(num2);
        }
        if (c){
            System.out.println("Equal");
        }
    }


}



/*
 Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */
