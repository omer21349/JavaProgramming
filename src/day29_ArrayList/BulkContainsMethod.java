package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkContainsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,3,3,3,4,4,4,5,5,5,6,6,6));

        boolean r1=list.containsAll(Arrays.asList(6));
        boolean r2=list.containsAll(Arrays.asList(1,4));

        System.out.println(r1);
        System.out.println(r2);






    }
}
