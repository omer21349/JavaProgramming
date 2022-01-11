package day20_Arrays;

import java.util.Arrays;

public class CmmonElements {
    public static void main(String[] args) {
        
        int num[]={1,2,3,4,5};
        int num2[]= {4,5,6,7,8};
         int count=0;
        for (int i = 0; i < num.length; i++) {
            for (int k = 0; k <num2.length ; k++) {
            if (num[i]==num2[k]) {
                int result = num[i];
                System.out.print(result+" ");


            }

            }
        }



    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

 */