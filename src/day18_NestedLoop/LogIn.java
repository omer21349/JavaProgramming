package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your username");
        String u=scan.next();

        System.out.println("enter your password");
        String p=scan.next();

        if (u.equals("Cydeo")&&p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {
            for (int i = 0; i < 3; i++) {
                System.out.println("incorrect user name or username");
                System.out.println("enter your username");
                u=scan.next();
                System.out.println("incorrect user name or passaword");
                System.out.println("enter your password");
                u=scan.next();
                if(u.equals("Cydeo")&&p.equals("woodenSpoon")) {
                    System.out.println("looged in");
                    break;
                }

            }if(!(u.equals("Cydeo")&&p.equals("WoodenSpoon"))){
                System.out.println("your accound locked.");
            }
        }
        scan.close();
    }
}
