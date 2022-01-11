package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char[] alphabets= new char [26];
        alphabets[0]='Z';
        alphabets[25]='A';
        alphabets[1]= 'Y';
        alphabets[2]= 88; //'X' asski table
        System.out.println(Arrays.toString(alphabets));

        System.out.println("______________________________________________________________");


        char alphave[]= new char[26];

        String result="";

        for (int i = 0,j='a'; i <=alphave.length-1&&j<='z' ; j++, i++) {
            alphave[i]=(char)j;
            result+=alphave[i]+" ";
        }
        System.out.println(Arrays.toString(alphave));
        System.out.println(result);




    }
}
