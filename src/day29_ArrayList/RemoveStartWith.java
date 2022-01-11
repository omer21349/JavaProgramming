package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveStartWith {
    public static void main(String[] args) {
        String[]names={"mary","monica","mehray","musti","sumeyra","hasan","beril"};

        ArrayList<String>names2=new ArrayList<>(Arrays.asList(names));

        names2.removeIf(p -> p.startsWith("m"));
        System.out.println(names2);
        //here if i wast to convert to from arraylist to array

        names=names2.toArray(new String[0]);
        System.out.println(Arrays.toString(names));


    }
}
