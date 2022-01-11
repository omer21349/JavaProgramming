package day28_ArrayList;

import java.util.ArrayList;

public class EqualsMethods {
    public static void main(String[] args) {

        ArrayList<Integer>word=new ArrayList<>();

        word.add(10);
        word.add(10);
        word.add(10);

        ArrayList<Integer>word2=new ArrayList<>();

        word2.add(10);
        word2.add(10);
        word2.add(10);

        System.out.println(word==word2);//bunu kabul etmemesinin sebebi word new object and word2 is another object;
        System.out.println(word.equals(word2));
    }
}
