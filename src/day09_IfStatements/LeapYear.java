package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args){
        int year = 2000;

        boolean leapYear= year % 4 ==0;

        if (leapYear){
            System.out.println( "year " + year + " is a leap year");
        }
        if (!leapYear){
            System.out.println("year " + year + " is NOT a leap year");
        }

        System.out.println("-----------------------------------------------");

        int year2 = 3001;

        boolean leapYear2= year2 % 4 ==0;

        if (leapYear2){
            System.out.println( "year " + year2 + " is a leap year");
        }
        else {
            System.out.println("year " + year2 + " is NOT a leap year");
        }




    }
}
