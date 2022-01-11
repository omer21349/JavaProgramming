package day14_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter first word:");
        String n1= input.nextLine();
        System.out.println("enter second word:");
        String n2= input.nextLine();
        System.out.println("enter third word:");
        String n3= input.nextLine();

        String b;

        if(n1.length()==n2.length()&&n1.length()==n3.length()){
            b= "All words are same length";
        }else if(n1.length()==n2.length()||n1.length()==n3.length()){
            b="Not Same or Different lengths";
        }else {
            b="All different length";
        }
        System.out.println(b);
        input.close();





    }

}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same or Different lengths"
            - if all different length :  print "All different length"
 */