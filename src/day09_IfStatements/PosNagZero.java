package day09_IfStatements;

public class PosNagZero {
    public static void main(String[] args) {

        int n = 0;

        if(n>0){
            System.out.println("positive");
        }
        else if (n<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }

        System.out.println("---------------------------------");

        // this exaple gonna be boolean way
        int a = -10;

        boolean pos= a>0;
        boolean neg= a<0;

        if (pos){
            System.out.println("positive");
        }
        else if(neg){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }





    }
}


