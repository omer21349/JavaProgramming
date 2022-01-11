package day23_Custommethods_Void;

import java.util.Scanner;

public class EligibleBuyAlcohol {
    public static void main(String[] args) {

        eligible();
    }

    public static void eligible(){

        Scanner input=new Scanner(System.in);
        System.out.println("enter a your age: ");
       int age =input.nextInt();

        String result="";
        if(age>=18){
            result="valid";
        }else {
            result="invalid";
        }
        System.out.println(result);



    }






}

/*
create a method that can check if a person is eligible to buy alcohol
 */
