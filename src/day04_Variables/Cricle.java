package day04_Variables;

public class Cricle {
    public static void main(String[] args) {
        double radius = 5.5;
        double PI = 3.14;
        double area= radius * radius * PI;
        double perimeter = 2 * radius * PI;
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }
}

/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
 */