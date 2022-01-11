package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraysToArrayList {
    public static void main(String[] args) {

        String names[]={"Josh","Jack","Shay","Breanna"};

       /* ArrayList<String>nameList=new ArrayList<>();

        nameList.addAll(Arrays.asList(names));*///first way to do


        System.out.println("----------------------------------------------------------------------------");

        ArrayList<String>nameList=new ArrayList<>(Arrays.asList(names));//Second and easy way
        System.out.println(nameList);

        System.out.println("----------------------------------------------------------------------------------");


        Integer [] arr={1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer>nameList2=new ArrayList<>(Arrays.asList(arr));

        System.out.println(nameList2);


        System.out.println("------------------------------------------------------------------------------");

        int [] arr2={1,2,3,4,5,6,7,8,9,10};

       ArrayList<Integer>nameList3=new ArrayList<>(coverArrayList(arr2));


        System.out.println(nameList3);
    }

    public static ArrayList<Integer>coverArrayList(int []array){

        ArrayList<Integer>list=new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }return list;

    }






}
