package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEmployesName {
    public static void main(String[] args) {


        ArrayList<String>employes =new ArrayList<>();
        employes.addAll(Arrays.asList("Ali","devid","Ahmed","jimmy","daniel","aaron","Ahmed","david","shay"));

        employes.retainAll(Arrays.asList("Ahmed","david"));

        System.out.println(employes);



    }
}
