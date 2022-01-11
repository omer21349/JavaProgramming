package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkRetainAllMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,3,3,3,4,4,4,5,5,5,6,6,6));

        System.out.println(list);

        list.retainAll(Arrays.asList(3,4,5));//here only leave which match with element

        System.out.println(list);


        System.out.println("----------------------------------------------------------");


        ArrayList<String>jobTitles=new ArrayList<>();

        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));


        jobTitles.retainAll(Arrays.asList("QA","SDET"));


        System.out.println(jobTitles);









    }
}
