package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //[10, 20, 30, 40, 50]= onceki halli
        //[20, 40, 60, 80, 100]=  sonraki haki, yani bizden butun sayilarin iki katini istiyor.
       for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);
        }
        System.out.println(list);


        System.out.println("-------------------------------------------------------------------------------");

        ArrayList<String>employees = new ArrayList<>();

        employees.add("suat");
        employees.add("ali");
        employees.add("veli");
        employees.add("neira");
        employees.add("aygun");
        employees.add("hulya");
        employees.add("cemil");
        employees.add("ozge");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);

        employees.remove(1);
        employees.remove(employees.size()-1);

        System.out.println(employees);


        employees.remove("cemil");
        System.out.println(employees);








    }
}
