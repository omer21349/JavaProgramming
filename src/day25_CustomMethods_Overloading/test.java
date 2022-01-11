package day25_CustomMethods_Overloading;

import utilities.ArrayUtilitiy;
import utilities.StringUtility;

public class test {
    public static void main(String[] args) {
        String str ="Java programing language";

        StringUtility.printEachChar(str);
        System.out.println();
        System.out.println(StringUtility.printReverse(str));
        System.out.println("-------------------------------------------------");

        String s1="Wooden spoon";
        System.out.println(StringUtility.printReverse(s1));

        String s2="madam";

        System.out.println(StringUtility.isPalindrome(s2));

        String [] names={"Anna","Java","Python","racecar","mom","Cydeo"};

        int count =0;
        for (String name : names) {
            if (StringUtility.isPalindrome(name)){
                count++;
            }
        }
        System.out.println(count);


        System.out.println("----------------------------------------------------------------");


        String s5="abmh";
        String s6="hbam";

        System.out.println(StringUtility.anagram(s5,s6));

        String s7="aaabbnnncc";
        String non=StringUtility.removeDuplicates(s7);
        System.out.println(non);

        System.out.println("---------------------------------------------------------------");

        int arr[]={10,20,30,50};
        ArrayUtilitiy.printEachElement(arr);

    }
}
