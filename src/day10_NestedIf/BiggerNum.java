package day10_NestedIf;

public class BiggerNum {
    public static void main(String[] args) {

        int num1= 115,
                num2=115,
                num3=45;
        String b =(num1>num2&&num1>num3)? "n1 is bigger":(num2>num1&&num2>num3)?"n2 is bigger":(num3>num1&&num3>num2)?"n3 is bigger":"equal number";
        System.out.println(b);


    }
}

/*
Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */
