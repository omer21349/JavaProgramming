package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkRemoveAllMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,3,3,3,4,4,4,5,5,5,6,6,6));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,4,5));

        System.out.println(list);





    }
}
