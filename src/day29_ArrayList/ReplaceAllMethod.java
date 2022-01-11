package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10,10,2,20,10,30,4,40,10,10));
        Collections.replaceAll(list,10,4);

        System.out.println(list);


    }
}