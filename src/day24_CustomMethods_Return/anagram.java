package day24_CustomMethods_Return;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
String f="absc cbsa";
        System.out.println(anagram(f));

    }
    public static String anagram(String word){

        String a[]= word.split(" ");
        String s="";
        String b="";
        String result="";
        s=a[0];
        b=a[1];
        char d[]=s.toCharArray();
        char h[]=b.toCharArray();
        Arrays.sort(d);
        Arrays.sort(h);

       if (Arrays.equals(d,h)) {
            result = "words are anagram";
        }else {
            result="words are not anagram";
        }
        return result;
    }

}
