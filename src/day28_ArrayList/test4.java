package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("veli");
        list.add("veli");
        list.add("mehmet");
        list.add("hasan");
        list.add("mahsun");
        list.add("cemil");
        list.remove("cemil");

        System.out.println(list);

        list.removeAll(Arrays.asList("veli"));
        System.out.println(list);










    }
}
