package day28_ArrayList;

import java.util.ArrayList;

public class test2 {

    public static void main(String[] args) {

        ArrayList<Integer>intro=new ArrayList<>();

        intro.add(10);
        intro.add(30);
        intro.add(1,20);
        System.out.println(intro);

        System.out.println("-------------------------------------------------------------");

        ArrayList<String>words=new ArrayList<>();
        words.add("omer");
        words.add("hakan");
        words.add("car");
        words.set(1,"cemil");

        System.out.println(words);



    }
}
