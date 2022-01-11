package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String name= "Omer Guven";
        
        char a= name.charAt(5);
        System.out.println("a = " + a);

        System.out.println("----------------------------------------------------------");


        String name2= "Omer Guven";

        int b = name2.length();
        System.out.println(b);


         System.out.println("-------------------------------------------------");


         String name4 = "omer guven";
        String mm= name4.toUpperCase();
        System.out.println("a = " + mm);

        System.out.println("-----------------------------------------------------------");

        String name5= "Hakan Tasiyan";
        String lower = name5.toLowerCase();
        System.out.println("lower = " + lower);



        System.out.println("--------------------------------------------------------------");


        String trim= "                   wooden spoon"            ;
        String name6 =trim.trim();
        System.out.println(name6);


        System.out.println("--------------------------------------------------");


        String num7= "wooden soon";
        int indexfirst= num7.indexOf("o");
        System.out.println("indexfirst = " + indexfirst);

        int indext8= num7.indexOf("oon");
        System.out.println("indext8 = " + indext8);


        System.out.println("------------------------------------------------------");

        String num8= "wooden soon";
        int n = num8.lastIndexOf("o");

        System.out.println("n = " + n); /// give to us last caracter whice number


        System.out.println("--------------------------------------------------------");


        String a14 = "omer";

        char b14=a14.charAt(0),
                c14=a14.charAt(a14.length()-1);

        System.out.println(b14+"."+c14);




















    }
}
