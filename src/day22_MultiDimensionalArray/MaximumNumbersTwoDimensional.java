package day22_MultiDimensionalArray;

public class MaximumNumbersTwoDimensional {
    public static void main(String[] args) {
        int [][] arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        int arrd =arr2d[0][0];
        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                if (anInt>arrd){
                    arrd=anInt;
                }
            }

        }System.out.println(arrd);


    }
}
/*
 Write a program that can find the minimum and maximum numbers from a two dimensional array
 */