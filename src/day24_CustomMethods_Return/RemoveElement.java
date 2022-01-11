package day24_CustomMethods_Return;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
       int[] array = {10, 20, 30, 40, 50, 60};
        int index = 5;
        System.out.println(Arrays.toString(removeElement(array,index)));
    }
    public static int [] removeElement(int arr[],int index){

        int ar2[]=new int[(arr.length)-1];
        for (int i = 0, j=0;j< arr.length&& i < ar2.length;j++) {
            if (j==index){
                continue;
        }ar2[i++]=arr[j];//burada i yi artirmanin sebebi yukarda artirirsak countinue ile tum sistemi skip ettigi icin i yi de edecek

        }return ar2;
    }
}
/*
create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */