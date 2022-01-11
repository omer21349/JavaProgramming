package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class ReverseArrayOverloading {
    public static void main(String[] args) {
        int ar1[]={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(ar1)));

        String ar2[]={"ali","hasam"};
        System.out.println(Arrays.toString(reverseArray(ar2)));


    }
    public static int[] reverseArray(int [] arr){
      int ar[]= new int [arr.length];

        for (int j=0, i = arr.length - 1;j<arr.length&& i >= 0;j++, i--) {
                  ar[j]=arr[i];
        }return ar;
    }
    public static double[] reverseArray(double [] arr){
        double ar[]= new double [arr.length];

        for (int j=0, i = arr.length - 1;j<arr.length&& i >= 0;j++, i--) {
            ar[j]=arr[i];
        }return ar;
    }
    public static char[] reverseArray(char [] arr){
        char ar[]= new char [arr.length];

        for (int j=0, i = arr.length- 1;j<arr.length&& i >= 0;j++, i--) {
            ar[j]=arr[i];
        }return ar;
    }
    public static String[] reverseArray(String [] arr){
        String ar[]= new String [arr.length];

        for (int j=0, i = arr.length-1;j<arr.length&& i >= 0;j++, i--) {
            ar[j]=arr[i];
        }return ar;
    }



}
/*
1. Create a method that can reverse an integer array

    2. Create a method that can reverse a double array

    3. Create a method that can reverse a char array

    4. Create a method that can reverse a String array

 */