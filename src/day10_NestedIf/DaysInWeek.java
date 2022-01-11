package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {
        int n =5;

        String b=(n==1)? "mondsy" :(n==2)? "tuesday" :(n==3)? "wednesday" :(n==4)? "thursday" :(n==5)? "friday" :(n==6)? "saturday" : "sunday";
        System.out.println(b);
    }
}
