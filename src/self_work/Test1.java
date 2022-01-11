package self_work;

import java.util.ArrayList;

public class Test1 {
    public static String name="omer";
    public static ArrayList<Integer>list=new ArrayList<>();



    static {
        list.add(10);
        list.add(20);

    }

    public static void main(String[] args) {
        System.out.println(Test1.list);
    }

}
