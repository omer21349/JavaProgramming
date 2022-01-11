package day22_MultiDimensionalArray;

import java.util.Arrays;

public class forEashLoop {
    public static void main(String[] args) {

        int [][] arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
        }



    }
}
