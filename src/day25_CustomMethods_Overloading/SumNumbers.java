package day25_CustomMethods_Overloading;

public class SumNumbers {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        int num3=40;
        int num4=50;

        System.out.println(sumTwoNumber(num1,num2));
        System.out.println(sumTreeNumber(num1,num2,num3));
        System.out.println(sumFourNumber(num1,num2,num3,num4));

    }
    public static int sumTwoNumber(int a,int b){

        int c=a+b;
        return c;
    }

    public static int sumTreeNumber(int a,int b,int c){

        int f=a+b+c;
        return f;
    }
    public static int sumFourNumber(int a,int b,int c,int d){

        int s=a+b+c+d;
        return s;
    }
}
