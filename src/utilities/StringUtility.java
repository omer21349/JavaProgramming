package utilities;

import java.util.Arrays;

public class StringUtility {

    public static void printEachChar(String str){
        //print each character
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }


    }

    public static String printReverse(String str){

        String result="";
        for (int i =str.length()-1; i >=0 ; i--) {
            result +=str.charAt(i);
        }return result;
    }

    public static boolean isPalindrome(String str) {
        return printReverse(str).equalsIgnoreCase(str);
    }

    public static boolean anagram(String str,String str2){
        char a[]=str.toCharArray();
        char b[]=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b) ;
    }

    public static String removeDuplicates(String str){

        String word="";
        for (int i = 0; i < str.length(); i++) {
               char each =str.charAt(i);
            if(!word.contains(each+"")){
                word+=each;
            }
        }return word;

    }

}
