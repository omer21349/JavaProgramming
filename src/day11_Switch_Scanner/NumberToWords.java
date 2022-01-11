package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int number= 7;

        String result = (number >= 0 && number<=9)?(number==0)?"zero":(number==1)?"oner":(number==2)?"two":
                (number==3)?"three":(number==4)?"four":(number==5)?"five":(number==6)?"six":(number==7)?"seven":
                        (number==8)?"Eight":"nine":"invalid number";
        System.out.println(result);


        System.out.println("----------------------------------");

        int num=5;
        String b;
        if(num>=0&&num<=9){

            switch (num){
                case 1:
                    b="one";
                    break;
                case 2:
                    b="two";
                    break;
                case 3:
                    b="three";
                    break;
                case 4:
                    b="four";
                    break;
                case 5:
                    b="five";
                    break;
                case 6:
                    b="six";
                    break;
                case 7:
                    b="seven";
                    break;
                case 8:
                    b="eight";
                    break;
                default:
                    b="nine";
            }
        }
        else {
            b="invalid number";
        }
        System.out.println(b);


    }
}



 /*
        rite a program that can convert numbers 0~9 to words.

    NOTE: MUST use ternary
         */