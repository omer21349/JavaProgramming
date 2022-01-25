package self_work;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciWithArray {
    public static void main(String[] args) {

       Scanner sr=new Scanner(System.in);
        System.out.println("enter a num1");
        int num1= sr.nextInt();

        int a[]=new int[num1];
            a[0]=0;
            a[1]=1;
//       0, 1, 1, 2, 3, 5, 8, 13,21
        for (int i = 2; i < num1; i++) {
            a[i]=a[i-1]+a[i-2];  // those are index number and a[0]=1, so first a[i] so that "i" is going to start 2 and i-1 si firs gonna be a[1]=1 and i-2 is gonna be a[0]=0
        }
        System.out.println(Arrays.toString(a));


        sr.close();
    }
}
