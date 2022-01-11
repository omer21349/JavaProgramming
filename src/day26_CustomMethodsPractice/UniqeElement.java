package day26_CustomMethodsPractice;

import utilities.ArrayUtilitiy;

import java.util.Arrays;

public class UniqeElement {

    public static void main(String[] args) {
        int array[]={1,2,3,1,1,1,2,2,3,3,5,5,6};
        int[] unique=uniqueElement(array);
        System.out.println(Arrays.toString(unique));


        double arr[]={1.2,2.5,3.5,1.4,1,1,2,2,3,3,5,5,6};
        double [] unique2=uniqueElement(arr);
        System.out.println(Arrays.toString(unique2));

    }



    //returns the unique elements of the array as a new array
    public static int[]uniqueElement(int array[]) {
        int[] result = {};
        for (int i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static double[]uniqueElement(double array[]) {
        double[] result = {};
        for (double i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static char[]uniqueElement(char array[]) {
        char[] result = {};
        for (char i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static String[]uniqueElement(String array[]) {
        String[] result = {};
        for (String i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }


}
