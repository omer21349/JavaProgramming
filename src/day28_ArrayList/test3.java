package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test3 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);
        }
        System.out.println(numbers);





    }
}
