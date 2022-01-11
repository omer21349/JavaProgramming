package day15_ForLoop;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter an account number");
        String num= input.nextLine();
        char a= num.charAt(0);
        int b= num.length();
        String c;
        if (a=='2'&&b==7||a=='5'&&b==10){
            c="Valid account number";
        }else{
            c="Invalid account number";
        }
        System.out.println(c);

        input.close();

    }
}
/*
Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
 */
