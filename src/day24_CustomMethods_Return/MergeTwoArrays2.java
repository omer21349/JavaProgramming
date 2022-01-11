package day24_CustomMethods_Return;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
       int [] arr1 = {1,2,3};
       int [] arr2 = {4,5,6};
        int arr3[]=mergeTwoArrays2(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static int [] mergeTwoArrays2(int ar1[],int ar2[]){
        int ar3[]=new int[ar1.length+ar2.length];
        int a=0;
        for (int i : ar1) {
            ar3[a++]=i;
        }
        for (int i : ar2) {
            ar3[a++]=i;
        }return ar3;


        }
    }


/*
Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

 */