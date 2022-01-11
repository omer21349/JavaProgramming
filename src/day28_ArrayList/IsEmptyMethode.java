package day28_ArrayList;

import java.util.ArrayList;

public class IsEmptyMethode {
    public static void main(String[] args) {


        ArrayList<Integer> word = new ArrayList<>();

        word.add(10);
        word.add(10);
        word.add(10);

        ArrayList<Integer> word2 = new ArrayList<>();

        word2.add(10);
        word2.add(10);
        word2.add(10);

        word2.clear();

        boolean a=word2.isEmpty();//its check the arraylist is it empty
        System.out.println(a);


    }
}
