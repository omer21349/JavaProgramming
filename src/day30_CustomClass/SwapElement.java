package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {


        ArrayList<Integer> swap=new ArrayList<>();
        swap.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.swap(swap,0,swap.size()-1);

        System.out.println(swap);



    }
}
/*
write a program that can swap the first and last elements of an ArrayList of Integers
 */