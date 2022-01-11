package day24_CustomMethods_Return;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int [] ar={1,2,3};
        int [] ar2={4,5};
        int [] c=mergeArrays(ar,ar2);
        System.out.println(Arrays.toString(c));

    }
    public static int [] mergeArrays(int[]a,int[]b) {

        int h[] = new int[a.length + b.length];
        int k=0;
        for (int i : a) {
            h[k++]=i;
        }
        for (int i : b) {
            h[k++]=i;
        }
        return h;
    }
}
/*
create a method that can merge two arrays and return
 the new array */