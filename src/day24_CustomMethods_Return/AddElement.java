package day24_CustomMethods_Return;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {

       int[] arr ={1,2,3};
       int num = 4;
        System.out.println(Arrays.toString(addElement(arr,num)));

    }
    public static int[] addElement(int arr[],int num){
        int num2[]= {num};
        int a=0;
        int ar[]= new int[arr.length+num2.length];

        for (int i : arr) {
            ar[a++]=i;
        }
        for (int i : num2) {
            ar[a++]=i;
        }
        return ar;

    }
}
/*
create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */
