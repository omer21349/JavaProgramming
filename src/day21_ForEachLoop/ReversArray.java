package day21_ForEachLoop;

import java.util.Arrays;

public class ReversArray {

    public static void main(String[] args) {
        int [] number= {10,20,30,40,50};
        int revers[] =new int [number.length];

        for (int i = 0,j=number.length-1; i < number.length&&j>=0;j--, i++) {
            revers[i]+=number[j];

        }
        System.out.println(Arrays.toString(revers));
    }
}
