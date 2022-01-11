package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password="Cydeo1990@";

        boolean a=password.length()>=8&&!password.contains("");

        boolean b=false,d=false,c=false,f=false;
        if(password.length()>=8&&!password.contains(" ")){
            a=true;
        }boolean result=false;
        for (char each : password.toCharArray()) {
            if(b = Character.isUpperCase(each)){
                result=true;
            }
            if(c = Character.isLowerCase(each)){
                result=true;
            }
            if (d = !(Character.isLetterOrDigit(each))){
                result=true;
            }
            if (f = Character.isDigit(each)){
                result=true;
            }
        }
        boolean z=a == true && b == true && c == true && d == true && f == true;
        System.out.println(result);

    }




    }

/*
Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */
