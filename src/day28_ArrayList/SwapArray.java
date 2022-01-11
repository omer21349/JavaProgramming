package day28_ArrayList;

import java.util.ArrayList;

public class SwapArray {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int a =list.get(list.size()-1);
        list.set(list.size()-1,1);
        list.set(0,a);
        System.out.println(list);



    }
}
/*
write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */