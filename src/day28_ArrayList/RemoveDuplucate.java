package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplucate {
    public static void main(String[] args) {

        ArrayList<Integer>word=new ArrayList<>();

        word.add(10);
        word.add(10);
        word.add(10);
        word.add(20);
        word.add(20);
        word.add(20);
        word.add(30);
        word.add(30);
        word.add(30);

        ArrayList<Integer>word2=new ArrayList<>();

        for (Integer each : word) {
            if(!word2.contains(each)){
                word2.add(each);
            }
        }
        System.out.println(word2);










    }
}
