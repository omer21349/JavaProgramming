package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your full name");
        String fullName= input.nextLine();

        System.out.println("enter your Programing Language: ");
        String program = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextInt();// yukarda age icin nextInt girdigimiz icin asagidaki kismi havizada enter olarak kaydedicek ve atlicak o kismi oyuzden bunu yazmaliyiz eger nextInt kullanucaksak

        System.out.println("enter the school name");
        String schoolName= input.nextLine();

        System.out.println("fullName = " +fullName);
        System.out.println("programming = " + program);

        input.close();
    }
}
