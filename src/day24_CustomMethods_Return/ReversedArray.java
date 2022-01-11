package day24_CustomMethods_Return;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int b []={1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverstArray(b)));
    }
    public static int []  reverstArray(int []ar){

        int a[]=new int[ar.length];
        for (int j=0, i = ar.length - 1;j<=ar.length-1&& i >= 0;j++, i--) {
            a[j]=ar[i];
        }
        return a;

    }
}
