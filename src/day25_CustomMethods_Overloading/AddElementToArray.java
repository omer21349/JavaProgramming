package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4};

        arr=addInteger(arr,5);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------------------------------------------");

        double []arr2={1.4,2.0,3.4,4.9};
        arr2=addDouble(arr2,5.4);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-----------------------------------------------------------------------------------");

        String[] ar={"tatiana","oleksandr","cassandra","ali"};
        ar =addString(ar,"igor");
        System.out.println(Arrays.toString(ar));

        System.out.println("-----------------------------------------------------------------------------------");

        char [] chars={'A','B','C','D'};
        chars =addChar(chars,'E');
        System.out.println(Arrays.toString(chars));

    }
    public static int []addInteger(int arr[],int num){

        int a []= new int[arr.length+1];

       int i=0;
        for (int each : arr) {
            a[i++]=each;
        }
        a[i]=num;
        return a;


    }
    public static double []addDouble(double arry[],double num1){
        double b []= new double[arry.length+1];

        int i=0;
        for (double each : arry) {
            b[i++]=each;
        }
        b[i]=num1;
        return b;

    }

    public static String[] addString(String str[],String word){

        String b []= new String[str.length+1];

        int i=0;
        for (String each : str) {
            b[i++]=each;
        }
        b[i]= word;
        return b;

    }
    public static char [] addChar(char ch[],char ch1){

        char b []= new char[ch.length+1];

        int i=0;
        for (char each : ch) {
            b[i++]=each;
        }
        b[i]= ch1;
        return b;
        
    }
}
/*
1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

        2. create a return method called addDouble that can add a double after the last index of a double array

        3. create a return method called addString that can add a String after the last index of a String array

        4. create a return method called addChar that can add a char after last index of a char array
 */
