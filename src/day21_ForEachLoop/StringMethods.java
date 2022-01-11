package day21_ForEachLoop;

import day03_EscapeSequences.Err_vs_Out;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str ="Java";
        for (char a:str.toCharArray()){
            System.out.println(a);
        }


        System.out.println("------------------------------------------");

        String str2 ="Java";

        char[] a= str2.toCharArray();

        System.out.println(Arrays.toString(a));
        for (char b:a){
            System.out.println(b);
        }




    }
}
