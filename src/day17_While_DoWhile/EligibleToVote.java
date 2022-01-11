package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();

        while (!(age>1&&age<120)){
            System.err.println("invalid number please enter again");
            age = input.nextInt();
        }
        System.out.println("elgible");


        System.out.println("-------------------------------");
        System.out.println("are you a sitecen? yes/no");
        String name= input.nextLine();

        while (!(name.equals("yes")||name.equals("no"))){
            System.out.println("invaled word re enter");
            name= input.nextLine();
        }
        System.out.println((name.equals("yes"))?"you can vote":"you can't vote");

        input.close();

    }
}
