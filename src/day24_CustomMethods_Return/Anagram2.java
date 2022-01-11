package day24_CustomMethods_Return;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
       String str1 = "cba",
        str2 = "bac";
        System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1,String str2){
       boolean result;
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }


}
/*
create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true

 */