package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {

        ArrayList<Integer>swapArraylist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(swapArraylist,0,swapArraylist.size()-1);
        System.out.println(swapArraylist);



    }
}
