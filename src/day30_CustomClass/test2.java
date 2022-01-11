package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        int num= list.size();
        list.removeIf(p -> p<1);
        int num2= list.size();
        int num3=num-num2;
        for (int i = 0; i <num3; i++) {
            list.add(0);
        }
        System.out.println(list);





    }
}
