package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test3 {
    public static void main(String[] args) {

       /* int a[]={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer>list=new ArrayList<>();
        for (int each : a) {
            list.add(each);
        }
        System.out.println(list);*/


        String r="ooomerrrg";
        char a5[]=r.toCharArray();
        ArrayList<Character>list2=new ArrayList<>();
        for (char each : a5) {
            list2.add(each);
        }
        String unique="";
        for (Character each2 : list2) {
            int frequency= Collections.frequency(list2,each2);
            if(frequency==1) {
                unique += each2;
            }
        }
        System.out.println(unique);




    }
}
