package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number= 200;
        boolean a = 0<number,
                b = 0 >number,
                c = 0==number;
        System.out.println(number + " is positive number: " + a);
        System.out.println(number + " is negative number: " + b);
        System.out.println(number + " is zero: " + c);
    }

}

/*
Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */