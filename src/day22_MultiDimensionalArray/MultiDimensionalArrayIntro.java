package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String grup1 []={"jon", "ali","mehmet"};
        String grup2 []={"aaron", "shay","breanna"};
        String grup3 []={"cassandra", "tahir","aygun"};

        String grup4[][]=new String[3][];

        grup4 [0]=grup1;
        grup4[2]=grup2;
        System.out.println(Arrays.deepToString(grup4));


        int [][] arr2d={{1,2,3,},{4,5,6,7},{8,9,10,11,12}};

        System.out.println(Arrays.deepToString(arr2d));

        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2d[1]));

        //{8}
        System.out.println(arr2d[2][0]);





    }
}
