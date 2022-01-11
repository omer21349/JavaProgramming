package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

          int max =list.get(0);
        for (Integer each : list) {
            if (each>max){
                max=each;
            }

        }System.out.println("max num: "+max);

        int min =list.get(0);
        for (Integer each : list) {
            if (each<min){
                min=each;
            }

        }System.out.println("min num: "+min);

        int sum =list.get(0);
        for (Integer each : list) {
            sum += each;
        }
        System.out.println("sum num: "+sum/list.size());







    }
}
