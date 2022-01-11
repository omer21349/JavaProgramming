package day21_ForEachLoop;

import java.util.Arrays;

public class mergeChar {
    public static void main(String[] args) {
        char [] ch1={'a','b','c','4','y'};
        char [] ch2={'d','e',};
        char[]  ch3= new char[ch1.length+ch2.length];
        int num=0;
        for (char c : ch1) {
            ch3[num++]=c;
        }
        for (char c :ch2){
            ch3[num++]=c;
        }

        System.out.println(Arrays.toString(ch3));


    }
}
