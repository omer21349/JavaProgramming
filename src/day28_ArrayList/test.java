package day28_ArrayList;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("veli");
        list.add("veli");
        list.add("mehmet");
        list.add("hasan");
        list.add("mahsun");
        list.add("cemil");
        String num = "veli";
        for (int i = 0; i < list.size(); i++) {
            list.remove(num);
        }
        System.out.println(list);
    }
}

