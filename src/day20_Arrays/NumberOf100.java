package day20_Arrays;

import java.util.Arrays;

public class NumberOf100 {
    public static void main(String[] args) {
        int num[]=new int[100];

        for (int i = 0, j=1; i <=num.length-1&&j<=100; i++,j++) {
            num[i]=j;

        }
        System.out.println(Arrays.toString(num));

        System.out.println("----------------------------------------------------------------------------------------");

        int num2[]=new int[100];
        String result="";
        for (int i = 0, j=100; i <=num2.length-1&&j>=1; i++,j--) {
            num2[i]=j;
            result+=num2[i]+" ";
        }
        System.out.println(Arrays.toString(num2));
        System.out.println("=====================================================================================");
        System.out.println(result);


    }
}
