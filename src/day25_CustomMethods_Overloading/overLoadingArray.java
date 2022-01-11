package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class overLoadingArray {
    public static void main(String[] args) {

        double a[]={1.2,1.8,2.5};
        a=addArray(a,5.12);
        System.out.println(Arrays.toString(a));

        String b[]={"ali","veli"};
        b=addArray(b,"hasan");
        System.out.println(Arrays.toString(b));

        char c[]={'A','b'};
        c=addArray(c,'v');
        System.out.println(c);

    }

    public static double []addArray(double arry[],double num1){
        double b []= new double[arry.length+1];

        int i=0;
        for (double each : arry) {
            b[i++]=each;
        }
        b[i]=num1;
        return b;

    }

    public static String[] addArray(String str[],String word){

        String b []= new String[str.length+1];

        int i=0;
        for (String each : str) {
            b[i++]=each;
        }
        b[i]= word;
        return b;

    }
    public static char [] addArray(char ch[],char ch1){

        char b []= new char[ch.length+1];

        int i=0;
        for (char each : ch) {
            b[i++]=each;
        }
        b[i]= ch1;
        return b;

    }
}
