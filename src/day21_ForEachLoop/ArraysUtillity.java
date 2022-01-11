package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtillity {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(num));

        System.out.println(num[5]);

        System.out.println("--------------------------------------------------");

        int [] scores ={ 95,100,55,65,85,78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("min: " +scores[0]);
        System.out.println("max: "+scores[scores.length-1]);

        System.out.println("__________________________________________________");

        String name[]= { "Gunay", "Anna", "Zuhal", "Ahmet", "Maria" ,"Sinema"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        System.out.println("-------------------------------------------------");

        int [] arr1 = {1,3,2};
        int [] arr2 = {1,2,3};

        boolean a= Arrays.equals(arr1,arr2);

        System.out.println(a);


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean a2 =Arrays.equals(arr1,arr2);
        System.out.println(a2);

        System.out.println("-------------------------------------");


        char [] ch1= {'a','c','b'};
        char [] ch2= {'b','a','c'};

        boolean s1 = Arrays.equals(ch1,ch2);
        System.out.println(s1);

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean s = Arrays.equals(ch1,ch2);
        System.out.println(s);



    }
}
