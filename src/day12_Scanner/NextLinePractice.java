package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("enter your full name");
        String fullName= input.nextLine();


        input.close();
    }


}


/*
1 ask the user to enter age (nextInt())
2 ask the user to enter full name (nextline())
 */