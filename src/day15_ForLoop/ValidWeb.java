package day15_ForLoop;

import java.util.Scanner;

public class ValidWeb {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter a website");
        String web= input.nextLine();
        String result;


        if(web.startsWith("www.")){
            if(web.endsWith(".com")) {
            result = "valid website";
            }
            else if(web.endsWith(".edu")) {
            result = "valid website";
            }
            else if(web.endsWith(".gov")) {
            result = "valid website";
            }else {
                result="invalid website";
            }
        }else {
            result="invalid website";
        }
        System.out.println(result);

        input.close();
    }

}

/*
write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */
