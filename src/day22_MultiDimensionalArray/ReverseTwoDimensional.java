package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTwoDimensional {
    public static void main(String[] args) {

        int array[][] = { {1,2,3}, {4,5,6}};
        int array2[][]= {{}};
        for (int i = array.length - 1,a=0;a<=array.length-1 &&i >= 0;a++, i--) {
            for (int j = array[a].length - 1,j2=0;j2<=array[a].length-1&& j >= 0;j2++, j--) {
                   array2[a][j2]=array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array2));

    }
}
/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */