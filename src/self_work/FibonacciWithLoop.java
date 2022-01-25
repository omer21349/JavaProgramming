package self_work;

import java.util.Scanner;

public class FibonacciWithLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();

      //  0, 1, 1, 2, 3, 5, 8, 13,21

        int a=0;
        int b=1;
        int result=0;

        for (int i = 2; i < num; i++) {
            result=a+b;
            a=b;
            b=result;
        }
        System.out.println(result);

        input.close();
    }
}
