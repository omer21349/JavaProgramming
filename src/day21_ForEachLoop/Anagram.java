package day21_ForEachLoop;

import java.sql.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="dbca";

        char []a=str1.toCharArray();
        char []b=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean anagram= Arrays.equals(a,b);
        System.out.println(anagram);

        }

    }