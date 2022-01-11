package day27_wrapperClasses;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        arr=swapArray(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] swapArray(int arr[],int index1,int index2) {

         for (int i = 0; i < arr.length; i++) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
      }return arr;
    }
    public static double[] swapArray(double arr[],int index1,int index2){

        for (int i = 0; i < arr.length; i++) {
            double temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }return arr;
    }
    public static char[] swapArray(char arr[],int index1,int index2){

        for (int i = 0; i < arr.length; i++) {
            char temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }return arr;
    }
    public static String[] swapArray(String arr[],int index1,int index2){

        for (int i = 0; i < arr.length; i++) {
            String temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }return arr;
    }
}

/*
1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
 */
