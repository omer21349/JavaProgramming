package day21_ForEachLoop;

public class PalindromesInArray {
    public static void main(String[] args) {
        String words[]={"anna", "level", "Java"};

        int count=0;
        for (String word : words) {
            String reverse="";
            for (int i = word.length()-1; i >= 0; i--) {
                reverse+=word.charAt(i);
                if(reverse.equals(word)){
                    count++;


            }

            }

        }System.out.println(count);


    }
}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */