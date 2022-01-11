package day26_CustomMethodsPractice;

import utilities.ArrayUtilitiy;

import java.util.Arrays;

public class RemoveElement2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        arr=RemoveElement2.removeElement(arr,1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removeElement(int[]array,int index){
        if(index<0||index> array.length-1){
            System.out.println("invalid index: " +index);
            System.exit(0);
        }

        int [] result={};
        for(int i=0;i<array.length;i++){
            if(i !=index){
                result= ArrayUtilitiy.addArray(result,array[i]);
            }
        }return result;

    }
}
