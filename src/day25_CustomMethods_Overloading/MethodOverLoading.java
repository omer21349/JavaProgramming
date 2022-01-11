package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverLoading {

    public static void main(String[] args) {

        int [] intArray ={5,6,0,-1,3,4};
        Arrays.sort(intArray);
        double [] doublesArray={10.5,11.5,5.5,4.5};
        Arrays.sort(doublesArray);
        char [] charArray={'E','F','D','R'};
        Arrays.sort(charArray);

        System.out.println("---------------------------------------------------------------------");

        int sum1= sumOfNumbers(10,20,30,40);
        System.out.println(sum1);
        int sum2= sumOfNumbers(10,20,30);
        System.out.println(sum2);

        double sum3= sumOfNumber(10,20,30);
        System.out.println(sum3);
    }
    public static int sumOfNumbers(int num1,int num2){
        return num1+num2;
    }
    public static double sumOfNumber(double num1,double num2){
        return num1+num2;
    }public static double sumOfNumber(double num1,double num2,double num3){
        return num1+num2+num3;
    }public static double sumOfNumber(double num1,double num2,double num3,double num4){
        return num1+num2+num3+num4;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}
