package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       // System.out.println("enter true or false");
        // boolean result = input.nextBoolean();

        System.out.println(" enter your name");
        String name = input.next(); // reads the input only until space

        System.out.println("name = "+ name);// burada "java beatufull" dersek sadece javayi alir cunku yukarda next in yanina nexLine yazmadigimiz icin



        input.close();


    }
}
