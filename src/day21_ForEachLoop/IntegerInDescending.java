package day21_ForEachLoop;

import java.util.Arrays;

public class IntegerInDescending {
    public static void main(String[] args) {
        int num []={1,2,3,8,4,7,6};
        Arrays.sort(num);
        int revers[]= new int[num.length];
        for (int j=0, i = num.length-1;j<= num.length-1&&i>=0;j++, i--) {
          revers[j]+=num[i];
        }
        System.out.print(Arrays.toString(revers));

    }
}
/*
Write a program that sort the array of integer in descending order
 */