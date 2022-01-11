package day07_Operators;

import java.util.SortedMap;

public class RelationalOparetors {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20 > 40; //false

        System.out.println("result = " +result1); // false

        System.out.println("---------------------------------");

        boolean result2 = 300 >= 150 ; // true

        System.out.println("result2 = " + result2); // true

        System.out.println("----------------------------------");

        boolean result3 = 100>= 100;
        System.out.println("result3 = " + result3);

        System.out.println("------------------------");

        boolean result4 = 300 >= 500 ;
        System.out.println("result4 = " + result4);

        System.out.println("-------------------------");

        // credit score of 720 u need to be have.
        int creditScore = 745; // am i eligible

        boolean isEligibleForLoan = creditScore >= 720; // if credit score 720 or greater, then it's eligble
        System.out.println(creditScore);


        boolean result5 = 100 < 120 ; // true
        System.out.println("result5 = " + result5);


        boolean result6 = 200 < 180; // false
        System.out.println("result6 = " + result6);

        int score= 59;
        boolean haseFailed = score <= 59;

        System.out.println("haseFailed = " + haseFailed);

        System.out.println("--------------------------------------");

        boolean result7 = 45 <= 60;

        System.out.println("result7 = " + result7);

        System.out.println("-----------------------------------------");

        int x = 100;
        int y = 200;
        boolean equal= x==y;

        System.out.println("equal = " + equal); //false because 200 not equal to 100

        System.out.println("-------------------------------");

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);

        System.out.println("--------------------------------");

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);

        System.out.println("--------------------------------");

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);

        System.out.println("------------------------------");

        boolean result11 = 100 != 200.5; //true
        System.out.println("result11 = " + result11);

        System.out.println("-------------------------------");

        boolean result12= "Java" != "Break";  // true
        System.out.println("result12 = " + result12);

        System.out.println("----------------------------");

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);

        System.out.println("-------------------------------");





    }
}
