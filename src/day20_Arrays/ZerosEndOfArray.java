package day20_Arrays;

import java.util.Arrays;

public class ZerosEndOfArray {
    public static void main(String[] args) {

        int num[] = {10, 0, 5, 0, 1, 0};
        int result[] = new int[num.length];
        int a=0;
        for (int i = 0; i < num.length; i++){
            if (num[i] != 0) {
                result [a]=num[i];
                a++;

         }
        }
        System.out.println(Arrays.toString(result));
    }
}


          /*  for (int j = 0; j < result.length; j++) {
        result[j]=num2;
        System.out.println(Arrays.toString(result));*/

/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */