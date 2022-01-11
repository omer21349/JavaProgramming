package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][][] arr3d={{{ 1,2,3 },{ 4,5,6 },{ 7,8,9 }}  ,  {{ 10,20,33 },{ 40,50,60 },{ 70,50,60 }}};

        System.out.println(Arrays.deepToString(arr3d));

        System.out.println(Arrays.deepToString(arr3d[1]));

        System.out.println(Arrays.toString(arr3d[1][0]));

        System.out.println(arr3d[1][0][1]);


        System.out.println("__________________________________________________________________");


        for (int[][] ints : arr3d) {

        }System.out.println(Arrays.deepToString(arr3d));

        for (int[][] ints : arr3d) {

        }
        System.out.println(Arrays.deepToString(arr3d[0]));

        for (int[][] ints : arr3d) {

        }
        System.out.println(Arrays.toString(arr3d[0][0]));

        for (int[][] ints : arr3d) {

        }
        System.out.println(arr3d[0][0][2]);


        System.out.println("--------------------------------------------------------------------------------------");

        for (int[][] arr2d:arr3d){
            for (int[] arr1d:arr2d){
                for (int arrd:arr1d){
                    System.out.print(arrd+" ");
                }
            }
        }



    }
}
