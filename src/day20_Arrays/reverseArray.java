package day20_Arrays;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int num[] = {1,2,3,4,5};
        int reverse[]=new  int[num.length];
        for (int j=0 ,i = num.length-1;j<=num.length-1&& i >=0;j++, i--) {
              reverse[j]+=num[i];

        }System.out.println(Arrays.toString(reverse));




    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */