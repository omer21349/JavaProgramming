package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;

        if(score>= 0 && score<=100) {
            if (score >= 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        }
        else{
            System.out.println("Score is not valid");
        }

        System.out.println("----------------------------------------------");


        int age= 25;
        boolean hasId= true;

        if(hasId){
            if (age>=21){
                System.out.println("Eligible to buy alcohol");
            }
            else{
                System.out.println("not eligible to buy alcohol");
            }
        }
        else{
            System.out.println("You must have ID to buy alcohol");
        }

        System.out.println("---------------------------------------------");

        int number =5;

        if( number>=1 && number<=7){

            if (number==1){
                System.out.println("Monday");
            }
            if (number==2){
                System.out.println("Tuesday");
            }
            if (number==3){
                System.out.println("wednesday");
            }
            if (number==4){
                System.out.println("thursday");
            }
            if (number==5){
                System.out.println("friday");
            }
            if (number==6){
                System.out.println("saturday");
            }
            if (number==7){
                System.out.println("sunday");
            }

        }
        else {
            System.out.println("invalid number");
        }





    }
}
