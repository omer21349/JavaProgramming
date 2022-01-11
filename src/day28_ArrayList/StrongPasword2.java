package day28_ArrayList;

public class StrongPasword2 {
    public static void main(String[] args) {
        String a="anAds12@kd";
        int count=0;
        int b=0,d=0,c=0,f=0;
        boolean k= a.length()>0&&!a.contains(" ");
        for (char each : a.toCharArray()) {
            if (Character.isUpperCase(each)){
                    b++;
            }else if(Character.isLowerCase(each)){
                d++;
            }else if(!Character.isLetterOrDigit(each)){
                c++;
            }else if(Character.isDigit(each)){
                f++;
            }
        }boolean k1=a.length()>8&&!a.contains(" ")&&b>0&&d>0&&c>0&&f>0;
        System.out.println(k1);



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