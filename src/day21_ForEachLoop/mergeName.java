package day21_ForEachLoop;

import java.util.Arrays;

public class mergeName {
    public static void main(String[] args) {
        String [] group1 ={"Ali","veli","Hasan","kerim"};
        String [] group2 ={"cemil","mehmet"};
        String [] group3 = new String[group1.length+group2.length];
        int a = 0;


        for (String s : group1) {

             group3 [a++]=s;
        }
        for (String s : group2) {
           group3[a++]=s;
        }

        System.out.println(Arrays.toString(group3));
    }
}
