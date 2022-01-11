package day23_Custommethods_Void;

import java.util.Arrays;
import java.util.Locale;

public class DollarEuro {
    public static void main(String[] args) {

        dollarEuro(10);
        dollarLira(20);
        kgLb(20);
        number(5);
        charactersString("omer");
        printEachElement(new int[]{10,3,4});
        calculator(10,20,'+');
        fullName("cYdEo","SCHOOL");
        anagram("silent","listen");


    }
    public static void dollarEuro (int dollar){

        double convert=dollar*0.88;
        System.out.println(convert);
    }
    public static void dollarLira(int lira){

        double convert =lira*13.88;
        System.out.println("one dollar: "+convert+"tl");

    }
    public static void kgLb(int lb){

        double concert=lb*2.20462;
        System.out.println("one kg: "+concert+"lb");

    }
    public static void number(int num){
        String result="";
        if(num>0){
            result="positive";
        }else if(num==0) {
            result="zero";
        }else {
            result="negative";
        }
        System.out.println(result);
    }
    public static void charactersString(String word){

        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));
        }


    }
    public static void printEachElement(int[] arry){


        for (int i : arry) {
            System.out.print(i+" ");
        }
        System.out.println();

    }
    public static void calculator(int a,int b,char c){
        int result=0;
        if(c=='+'){
            result=a+b;
        }else if(c=='-'){
            result=a-b;
        }else if(c=='*'){
            result=a*b;
        }else {
            result=a/b;
        }
        System.out.println(result);
    }
    public static void fullName(String word1,String word2){

        word1=word1.substring(0,1).toUpperCase()+word1.substring(1).toLowerCase();
        word2=word2.substring(0,1).toUpperCase()+word2.substring(1).toLowerCase();
        System.out.println(word1+" "+word2);
    }
    public static void anagram(String a,String b){
        char[] a1= a.toCharArray();
        char[] b2=b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b2);

       if (Arrays.equals(a1,b2)){
            System.out.println(a+" and "+b+" are anagram");
        }else {
            System.out.println(a+" and "+b+" not are anagram");
        }


    }

}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

	2. create a method that can print even numbers between 1~100 in a same line saperated by space

	3. create a method that can check if a person is eligible to buy alcohol

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


	5. create a method that can calculate the grade of the student based on the score

	6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square

	9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb

	12. create a method that can if the given integer is positive, negative or zero

	13. create a method named printEachChar that can print each characters of a string

	14. create a method named printEachElement that can print each elements of an integer array

	15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result


	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"


    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */