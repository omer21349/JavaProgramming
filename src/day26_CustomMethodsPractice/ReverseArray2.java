package day26_CustomMethodsPractice;

import utilities.ArrayUtilitiy;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {
        int []ar={1,2,3,4,5};
        int[]result=reversArray(ar);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reversArray(int[]array){
        int[]result={};
        for (int i = array.length-1; i >=0 ; i--) {
            result= ArrayUtilitiy.addArray(result,array[i]);
        }
        return  result;
    }
}
