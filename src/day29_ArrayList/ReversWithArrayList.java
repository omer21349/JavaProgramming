package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversWithArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> reverse=new ArrayList<>();
        reverse.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> result=new ArrayList<>();
        for (int i = reverse.size() - 1; i >= 0; i--) {
           int each =reverse.get(i);
            result.add(each);
        }
        System.out.println(result);





    }
}
