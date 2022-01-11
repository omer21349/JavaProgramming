package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(2,7);
        numbers.add(numbers.lastIndexOf(40),4 );
        System.out.println(numbers);
        System.out.println(numbers.size());

        int lastIndex= numbers.size()-1;
        System.out.println(lastIndex);
        int a =numbers.get(lastIndex);//unboxing
        Integer b=numbers.get(lastIndex);
        System.out.println(a);
        System.out.println(b);
        System.out.println(numbers.get(2));
        System.out.println("--------------------------------------------------------------------------");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();

        System.out.println("-------------------------------------------------------------------------------");

        ArrayList<String>list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.set(2,"JavaScript");//set method make chage new one
        list.set(3,"C++");

        System.out.println(list);





    }
}
