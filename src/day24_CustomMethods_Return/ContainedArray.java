package day24_CustomMethods_Return;

import java.util.Arrays;

public class ContainedArray {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6,7};
        int num = 1;
        System.out.println(containedArray(arr,num));
    }
    public static boolean containedArray(int arr[],int num) {
        boolean a;
        int j = 0;
        for (int i : arr) {
            if (i == num) {
                j++;
            }


        }return (j != 0);
    }
}
/*
Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */