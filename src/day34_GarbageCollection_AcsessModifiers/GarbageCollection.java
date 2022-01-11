package day34_GarbageCollection_AcsessModifiers;

import java.util.ArrayList;

public class GarbageCollection {
    public static void main(String[] args) {

        String str="wodden spoon";//this one goes in garbage collection
        str="ali";

        System.out.println(str);


        System.out.println("------------------------------------------------------------");


        String word="omer";
        word=null;   //this another way to sent a garbage collection
        System.out.println(word);


        System.out.println("-------------------------------------------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);



















    }



}
