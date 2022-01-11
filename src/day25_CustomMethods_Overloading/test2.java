package day25_CustomMethods_Overloading;

import utilities.ArrayUtilitiy;

public class test2 {

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        ArrayUtilitiy.printEachElement(arr1);

        System.out.println("-------------------------------------");

        double [] arr2={1,2,3,4,5};
        ArrayUtilitiy.printEachElement(arr2);
        System.out.println("-------------------------------------------------------");
        char [] arr3={'a','b','v'};
        ArrayUtilitiy.printEachElement(arr3);

        System.out.println("-------------------------------------------------------");
        String [] arr4={"ali","veli","omer"};
        ArrayUtilitiy.printEachElement(arr4);

        int ar[]={1,2,3,3,4,8,9,7};

        System.out.println(ArrayUtilitiy.max(ar));

        double ar2[]={1.5,2.8,3.4,3.3,4.1,8,9,7};

        System.out.println(ArrayUtilitiy.max(ar2));


        int ar1[]={1,2,3,3,4,8,9,7};

        System.out.println(ArrayUtilitiy.min(ar1));

        double ar3[]={1.5,2.8,3.4,3.3,4.1,8,9,7};

        System.out.println(ArrayUtilitiy.min(ar3));

        int[]a1={1,2,3,4,5,6,7};
        boolean r1=ArrayUtilitiy.contains(a1,7);
        System.out.println(r1);


    }

}
