package day24_CustomMethods_Return;

public class test2 {
    public static void main(String[] args) {

        String a="level";
        System.out.println(anagram(a));
    }
    public  static String anagram (String word) {
        String b = "", result = "";
        for (int j = word.length() - 1; j >= 0; j--) {
            b += word.charAt(j) + "";
        }
        if (b.equals(word)) {
            result = word + " is anagram";
        } else {
            result = word + " is not anagram";
        }
        return result;
    }



    }

