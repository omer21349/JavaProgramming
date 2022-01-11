package day09_IfStatements;

public class MaxNum {
    public static void main(String[] args) {
        int a =  330,
                b= 60;

        boolean max= a>b;

        if (max){
            System.out.println("Max number is "+a);
        }
        else {
            System.out.println("Max number is "+b);
        }
    }
}
