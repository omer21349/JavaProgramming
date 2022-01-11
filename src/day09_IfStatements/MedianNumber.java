package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args){
        int a = 10,
                b= 20,
                c= 30;
        boolean median = (a<b && a>c) || (a<c && a>b);
        boolean median1= (b<a && b>c) || (b<c && b>a);
        boolean median2= !median || !median1; //we can use this also c<a && c>b || c<b && c>a;

        if (median){
            System.out.println(a);
        }
        if (median1){
            System.out.println(b);
        }
        if (median2){
            System.out.println(c);
        }




    }
}


/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
