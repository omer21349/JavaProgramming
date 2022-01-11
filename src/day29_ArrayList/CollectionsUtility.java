package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------");

        ArrayList<Character>list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','D','E'));

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("------------------------------------------------------------------------------");

        ArrayList<Integer>list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));


        Collections.swap(list3,0,3);//its works with index number.

        System.out.println(list3);

        System.out.println("---------------------------------------------------------------------------");


        int max=Collections.max(list3);
        int min=Collections.min(list3);

        System.out.println("max number: "+max);
        System.out.println("min number: "+min);






    }
}
