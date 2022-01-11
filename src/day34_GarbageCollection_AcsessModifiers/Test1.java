package day34_GarbageCollection_AcsessModifiers;

import java.util.Arrays;

public class Test1 {

    public static String reverse(String stc){
        String s[]=new String[stc.length()];
        String a[]=stc.split("");
        String b="";
        for (int j=0,i = a.length-1; i >=0;j++, i--) {
            s[j]=a[i];
        }
        for (String each : s) {
            b+=each;
        }
            return b;
        }

    }

