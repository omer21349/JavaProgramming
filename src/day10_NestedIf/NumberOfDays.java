package day10_NestedIf;

public class NumberOfDays {
    public static void main(String[] args) {
        int month= 10;
        int a;

        if(month>=0 &&month<=12){
            if(month==2){
              a=28;
            }
            else if(month==4 || month==6 || month==9 || month==11){
                a=30;
            }
            else{
                a=31;
            }
            System.out.println(a);
        }
        else {
            System.out.println("wrong number");
        }


    }
}

/*
Create a class named NumberOfDays, an integer variable named month that has numbers 1 ~12 is given to you, write a program that can find the number of days in the given number of month.

            EX:
                month = 5

            output:
                31 days

            (Assume that February has 28 days)
 */