package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,50,40,80));


        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list2);



    }
}
