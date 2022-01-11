package day26_CustomMethodsPractice;

import utilities.ArrayUtilitiy;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int ar[]={1,2,3,4};
        int ar2[]={5,6};
        int []ar3=MergeTwoArray.merge(ar,ar2);
        System.out.println(Arrays.toString(ar3));
    }

    public static int[] merge(int arr1[],int arr2[]){

        int [] result= {};
        for (int each:arr1){
            result= ArrayUtilitiy.addArray(result,each);
        }for (int each:arr2){
            result= ArrayUtilitiy.addArray(result,each);
        }return result;

    }
}
