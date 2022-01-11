package day10_NestedIf;

public class FINRA {
    public static void main(String[] args) {
        int a =41;

        if (a%3==0&&a%5==0){
            System.out.println("FINRA");
        }
        else if (a%5==0){
            System.out.println("RA");
        }
        else if(a%3==0) {
            System.out.println("FIN");
        }
        else{
            System.out.println(a);
        }

    }
}


/*
Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
 */