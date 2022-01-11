package day28_ArrayList;

import java.util.ArrayList;

public class MaximumNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
         Integer c =list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>c){
                c=list.get(i);
            }
        }
        System.out.println(c);




    }
}
 /*   Write a program that can find the maximum number from an ArrayList of integers
		Ex:
                list = [1,2,3,4,5];
                output:
                5
*/
