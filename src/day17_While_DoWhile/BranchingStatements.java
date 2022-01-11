package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (char i = 'A';  i<'Z' ; i++) {
            if (i=='E'){
                break;
            }System.out.print(i);
        }
        System.out.println();

        System.out.println("-----------------------------------------------");

        while (true){
            System.out.println("please enter a number");
            int num=input.nextInt();
            if (num<0){
            break;
        }

        }
        input.close();

    }
}
