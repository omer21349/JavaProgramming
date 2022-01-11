package day30_CustomClass;

import java.util.ArrayList;
import java.util.Collections;

public class test3 {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char a[]=str.toCharArray();
        ArrayList<Character>str2=new ArrayList<>();

        for (char each : a) {
            str2.add(each);
        }
        ArrayList<Character>digit=new ArrayList<>(str2);
        digit.removeIf(p-> !Character.isDigit(p));

        ArrayList<Character>letter=new ArrayList<>(str2);
        letter.removeIf(p-> !Character.isLetter(p));

        ArrayList<Character>special=new ArrayList<>(str2);
        special.removeIf(p-> Character.isLetterOrDigit(p));

        System.out.println("digit: "+digit);
        System.out.println("letter = " + letter);
        System.out.println("special = " + special);
    }
}
