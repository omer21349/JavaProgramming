package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();
        list.addAll(Arrays.asList("Ali","veli","veli","veli","veli","mehmet","hasan","veli","okan","yasin","veli"));

        String word="veli";

        for (int i = 0; i < list.size(); i++) {
             list.remove(word);
        }
        System.out.println(list);




    }
}
