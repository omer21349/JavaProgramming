package day21_ForEachLoop;

import java.util.Arrays;

public class mergeNumber {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4};
        int arr2[]= {5,6};
        int merge[]=new int[arr1.length+arr2.length];
        int a=0;
        for (int each : arr1) {
            merge[a++]=each;
        }
        for (int each : arr2) {
            merge[a++]=each;
        }
        System.out.println(Arrays.toString(merge));
        }


    }

