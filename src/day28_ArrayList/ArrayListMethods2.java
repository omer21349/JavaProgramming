package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);


      //  int num1=1;
        //list.remove(num1);

        Integer num=200;

        list.remove(num);
        boolean a= list.remove(num);
        System.out.println(a);


        System.out.println(list);


        list.clear();

        System.out.println(list);








    }
}
