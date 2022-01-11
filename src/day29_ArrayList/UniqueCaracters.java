package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCaracters {
    public static void main(String[] args) {
        String str="aaabc ccdeeef";

        String[]arr=str.split("");

        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr));

        for (String each : list) {
            int a= Collections.frequency(list,each);
            if(a==1){
                System.out.println(each);
            }
        }









    }
}
