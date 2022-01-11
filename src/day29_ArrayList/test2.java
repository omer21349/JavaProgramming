package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,8,6,7,8,5));

        boolean c=list.containsAll(Arrays.asList(6,5,8));
        boolean d=list.contains(5);

        System.out.println(c);
        System.out.println(d);

        list.removeAll(Arrays.asList(1,2,5));
        System.out.println(list);

        list.retainAll(Arrays.asList(8));
        System.out.println(list);




    }
}
