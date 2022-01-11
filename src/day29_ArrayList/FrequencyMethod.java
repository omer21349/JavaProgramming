package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10,10,2,20,10,30,4,40,10,10));

        int count=Collections.frequency(list,10);
        System.out.println(count);

        ArrayList<String> words= new ArrayList<>();
        words.addAll(Arrays.asList("java","java","python","ruby","c#"));

        int countJava=Collections.frequency(words,"java");

        System.out.println(countJava);


    }
}
