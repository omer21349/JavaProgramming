package day09_IfStatements;

public class MinNum {
    public static void main(String[] args) {
        int c = 100,
                b=150;
        boolean minNum1 = c<b,
                minNum2 = b<c;

        if (minNum1){
            System.out.println("Minimum number is " + c);
        }
        else{
            System.out.println("minimum number is " + b);
        }
    }

}
