package day24_CustomMethods_Return;

import java.util.Arrays;

public class ReversedArray2 {
    public static void main(String[] args) {
          int arr []= {10, 20, 30, 40};
        int ar2[]=reversed(arr);
        System.out.println(Arrays.toString(ar2));
    }
    public static int[] reversed(int ar []){
       int arr[]= new int[ar.length];
        for (int j=0, i = ar.length - 1;j<= ar.length-1&& i >= 0;j++, i--) {
            arr[j]=ar[i];
        }
        return arr;
    }
}
/*
Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

 */
