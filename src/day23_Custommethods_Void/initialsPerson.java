package day23_Custommethods_Void;

import java.util.Arrays;
import java.util.Locale;


public class initialsPerson {

    public static void main(String[] args) {
        initialsPerson("omer guven");

    }
    public static void initialsPerson (String fullName){


        for (int i = 0; i < fullName.length(); i++) {

        }System.out.print(fullName.toUpperCase().charAt(0)+"."+fullName.toUpperCase().charAt(fullName.indexOf(" ")+1));


        }


}
