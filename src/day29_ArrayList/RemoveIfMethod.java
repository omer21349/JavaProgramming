package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list =new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf(each -> each>5);//we use lambda expression and remove all number biger than 5

        System.out.println(list);


        System.out.println("---------------------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf( c -> c%2==0);//here we remove all even number in array list

        System.out.println(list2);

        System.out.println("----------------------------------------------------------------------");


        ArrayList<String> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));

        list5.removeIf(p -> p.startsWith("J"));

        System.out.println(list5);

        System.out.println("---------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Python","Java","Cydeo"));

        names.removeIf(j -> StringUtility.isPalindrome(j));//removes if it palindrome

        System.out.println(names);


        System.out.println("---------------------------------------------------------");

        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Python","Java","Cydeo"));//removes if it not palindrome;

        names2.removeIf(j -> !StringUtility.isPalindrome(j));

        System.out.println(names2);







    }
}
