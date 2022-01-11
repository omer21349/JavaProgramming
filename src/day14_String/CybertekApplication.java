package day14_String;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Username:");
        String username=input.nextLine();
        System.out.println("password:");
        String password=input.nextLine();

        String a= "Cydeo",
                b="WoodenSpoon",
                c;

        if(username.equals(a)&&password.equals(b)){
            c="Logged in.";
        }
        else {
            c="Incorrect username or password";
        }
        System.out.println(c);

        input.close();







    }
}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method


 */
