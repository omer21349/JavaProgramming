package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n =100;
        if(n%2 ==0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        System.out.println("----------------------------------------");

        String n2= (n%2 ==0)? "even": "odd";
        System.out.println(n2);


        System.out.println("--------------------------------------------");

        int age=20;

        String a= (age>=21)? "eligible": "not eligible";
        System.out.println(a);

        System.out.println("---------------------------------------------");

        int num=100;

        String b= (num>0)? "pozitive" :(num<0) ?"negative" : "zero" ;
        System.out.println(b);

        }

    }

