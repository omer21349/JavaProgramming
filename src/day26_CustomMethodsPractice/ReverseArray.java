package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []ar={1,2,3,4,5};
        int[]result=reverseArray(ar);
        System.out.println(Arrays.toString(result));

    }
    public static int[] reverseArray(int arr[]){
        int result [] = new int[arr.length];
        for (int i = 0,j= arr.length-1; i <=arr.length-1&&j>=0; i++,j--) {
           result[i]=arr[j];
        }
        return result;
    }
}
