package day17_While_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter a user name");
        String u = input.nextLine();
        System.out.println("please enter a passaword name");
        String p = input.nextLine();
        String userName="Cydeo";
        String password="Cydeo123";

        if(u.equals(userName)&&p.equals(password)){
            System.out.println("Log-in");
        }else {
            int times=3;
            while (!(u.equals(userName)&&p.equals(password)&&times>0)&&times>0){
                System.out.println("user name not correct please enter again");
                u = input.nextLine();
                System.out.println("passaword not correct please enter again");
                p = input.nextLine();
                times--;
            }if((u.equals(userName)&&p.equals(password))){
                System.out.println("Log-in");
            }else {
                System.out.println("your account locked");
            }
        }
        input.close();
        }


    }

/*
ou are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */