package day18_NestedLoop;

public class UniqueCharacters {
    public static void main(String[] args) {
        String word="aabccdeef";
        String result="";

        for (int i = 0; i < word.length(); i++) {
            int count=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result+=word.charAt(i);
            }
        }System.out.print(result);

    }
}
/*
Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique


 */
