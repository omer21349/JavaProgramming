package day27_wrapperClasses;

import utilities.ArrayUtilitiy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,1,1,1,2,2,2,3,3,3,4,4,};
        int b[]=removeDuplicates(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] removeDuplicates(int []array){

        int[] result={};
        for (int each : array) {
            if(!ArrayUtilitiy.contains(result,each)){
                result=ArrayUtilitiy.addArray(result,each);
            }
        }return result;
    }



}
