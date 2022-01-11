package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class overleodingArray2 {
    public static void main(String[] args) {
        int ar1 []={10};
        int ar2[]={20};
        System.out.println(Arrays.toString(mergeArray(ar1,ar2)));

        String ar3 []={"ali"};
        String ar4[]={"veli"};
        System.out.println(Arrays.toString(mergeArray(ar3,ar4)));

        char ar5 []={'y'};
        char ar6[]={'v'};
        //char ar6=mergeArray('p','g');
        System.out.println(Arrays.toString(mergeArray(ar5,ar6)));


    }
    public static int[] mergeArray(int[] ar1, int[] ar2){

        int arr[]= new int[ar1.length+ ar2.length];
       int a=0;
        for (int i : ar1) {
            arr[a++]=i;

        }
        for (int i : ar2) {
            arr[a]=i;
        }
        return arr;
    }
    public static double[] mergeArray(double[] ar1, double[] ar2){

        double arr[]= new double[ar1.length+ ar2.length];
        int a=0;
        for (double i : ar1) {
            arr[a++]=i;

        }
        for (double i : ar2) {
            arr[a]=i;
        }
        return arr;
    }
    public static char[] mergeArray(char[] ar1, char[] ar2){

        char arr[]= new char[ar1.length+ ar2.length];
        int a=0;
        for (char i : ar1) {
            arr[a++]=i;

        }
        for (char i : ar2) {
            arr[a]=i;
        }
        return arr;
    }
    public static String[] mergeArray(String[] ar1, String[] ar2){

        String arr[]= new String[ar1.length+ ar2.length];
        int a=0;
        for (String i : ar1) {
            arr[a++]=i;

        }
        for (String i : ar2) {
            arr[a]=i;
        }
        return arr;
    }
    
    
}
