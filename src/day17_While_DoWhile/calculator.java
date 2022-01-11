package day17_While_DoWhile;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("please enter first number:");
        int number = input.nextInt();
        System.out.println("enter secont number:");
        int number2 = input.nextInt();
        input.nextLine();
        System.out.println("enter caracter number:");
        char caracter= input.next().charAt(0);


        while (!(caracter=='+'||caracter=='-')){
            System.err.println("invalid caracter. please enter again.");
            caracter=input.next().charAt(0);

        }
        System.out.println((caracter=='-')?number-number2:number+number2);
        input.close();

    }
}
