package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {
         char a = 'E';

         String b =(a>='A'&&a<='F')?(a=='A')? "excellent":(a=='B')? "Good job":(a=='C')? "good":(a=='D')?"passed":"faild":"invalid";
        System.out.println(b);



    }
}

/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
