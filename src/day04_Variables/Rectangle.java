package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        int length= 4;
        int width=16;
        int area = length * width;
        int perimeter= 2*( length + width);
       System.out.println("perimeter = " + perimeter);
       System.out.println("area = " + area);
        // System.out.println("area=" + area ); (uzun yontem)
    }
}


/*
Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */
