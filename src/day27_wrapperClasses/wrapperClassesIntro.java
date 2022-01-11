package day27_wrapperClasses;

public class wrapperClassesIntro {

    public static void main(String[] args) {
        int num1= 200;

        Integer n1=num1;// its calls autoboxing

        int num2 = n1; // this proses call unboxing

        System.out.println("--------------------------------------------------------------------");

        Integer integerValue=100;

        long longValue=integerValue;


        Byte b1=25;

        byte a1=b1;
        short a2=b1;

        System.out.println("--------------------------------------------------------------------------");

        int num3 =200;

        //Long l2=num3; you can't use thise because it out of range for int

        Integer num4= num3; //autoboxing




    }
}
