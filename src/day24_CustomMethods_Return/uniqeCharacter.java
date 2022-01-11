package day24_CustomMethods_Return;

public class uniqeCharacter {
    public static void main(String[] args) {
           String t="aaabbbcdv";

        System.out.println(uniqeCharacter(t));
    }
    public static String uniqeCharacter(String word){
           String c="";
        for (int i = 0; i < word.length(); i++) {
            int cout=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    cout++;
                }
            }if(cout==1) {
                c+=word.charAt(i)+"";
            }
        }
        return c;

    }


}
