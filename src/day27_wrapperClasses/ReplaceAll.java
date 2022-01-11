package day27_wrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int arr[] = {10, 10, 20, 30, 40, 30, 30, 30};
        arr=replaceAll(arr,30,50);
        System.out.println(Arrays.toString(arr));
    }

public static int[] replaceAll(int []ar,int element,int newElement){

    for (int i = 0; i < ar.length; i++) {
         if(ar[i]==element){
            ar[i]=newElement;
        }
    }return ar;
}




}
/*
RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

 */
