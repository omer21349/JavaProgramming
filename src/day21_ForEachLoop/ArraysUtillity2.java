package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtillity2 {
    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem","Gunay", "Cihad","David","James","Aaron","Daniel"};
        String [] earlyBirds = Arrays.copyOf(students,3);

        System.out.println(Arrays.toString(earlyBirds));

        int [] num = {1,2,3,4,5,6};
        num=Arrays.copyOf(num,3);
        System.out.println(Arrays.toString(num));

        char [] ch1= {'a','b','c','d','e','f','g','h','i'};
        ch1= Arrays.copyOfRange(ch1 ,3,6);

        System.out.println(Arrays.toString(ch1));

        System.out.println("======================================================");

        int [] score ={10,20,30,40,50,60,70,80,90,100};
        int[]result= Arrays.copyOfRange(score,4,8+1);

        System.out.println(Arrays.toString(result));










    }
}
