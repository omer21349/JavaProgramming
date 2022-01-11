package day10_NestedIf;

public class AgeGroups2 {
    public static void main(String[] args) {
        int age= 15;

        String b=(age>=0&&age<=150)?(age>55)? "Senior":(age>=21)?"Adult": "Teenage": "Invalid";
        System.out.println(b);


    }
}
/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
