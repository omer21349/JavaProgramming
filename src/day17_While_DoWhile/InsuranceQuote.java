package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your gender");
        String gender = input.nextLine();
        while (!(gender.equalsIgnoreCase("fimale")||gender.equalsIgnoreCase("male"))){
            System.out.println("invalid entry, please re enter your gender");
            gender = input.nextLine();
        }
        System.out.println("Are you married?");
        String married= input.nextLine();
        while (!(married.equalsIgnoreCase("yes")||married.equalsIgnoreCase("no"))){
            System.out.println("invalid entry, please re enter are your married statue");
        }
        System.out.println("How old are you");
        int age = input.nextInt();
        while (!(age>0&&age<120)){
            System.out.println("invalid age please re enter your age");
            age = input.nextInt();
        }System.out.println("How many mile do you drive in a day");
        int mile = input.nextInt();
        while (!(mile>5)){
            System.out.println("invalid entry please re enter your mile");
            age = input.nextInt();
        }
        input.nextLine();
        System.out.println("do you want to full coverage or liability insurance");
        String insurance= input.nextLine();
        System.out.println("do you have any accidents or claims in past 5 years");
        String accidents= input.nextLine();
        while (!(accidents.equalsIgnoreCase("yes")||accidents.equalsIgnoreCase("no"))){
            System.out.println("invalid entry, please re enter your accident statue");
            accidents= input.nextLine();
        }
        System.out.println("does your car has an anti-theft device");
        String anti= input.nextLine();
        while (!(anti.equalsIgnoreCase("yes")||anti.equalsIgnoreCase("no"))){
            System.out.println("invalid entry, please re enter does your car has an anti-theft device");
            anti= input.nextLine();
        }
        double marriedfull;
        double marriedlib;
        double accidentslib;
        double antilib;
        double accidentsfull;
        double antifull;
        double mileslib;
        double agelib;
        double agefull;
        double milesfull;
        if(insurance.equals("liability")) {
            if (age < 25) {
                agelib = 90;
            } else {
                agelib = 50;
            }if(mile <= 10){
                mileslib=10;
            }else if(mile > 10&&mile<=50){
                mileslib=30;
            }else {
                mileslib=50;
            }double liabilityTotal =agelib+mileslib;
            if (anti.equalsIgnoreCase("yes")) {
                antilib=liabilityTotal*0.05;
            }else {
                antilib=0;
            }if (accidents.equalsIgnoreCase("yes")){
                accidentslib=liabilityTotal*0.15;
            }else {
                accidentslib =liabilityTotal*(-0.1);
            }if(married.equalsIgnoreCase("yes")){
                marriedlib=liabilityTotal*(-0.05);
            }else {
                marriedlib=0;
            }
            System.out.println("total incurence cost:"+(liabilityTotal+antilib+accidentslib+marriedlib));

        } else {
            if (age < 25) {
                agefull = 160;
            } else {
                agefull =120;
            }if(mile <= 10){
                milesfull=20;
            }else if(mile > 10&&mile<=50){
                milesfull=40;
            }else {
                milesfull=70;
            }double fullCoverageTotal=agefull+milesfull;
            if (anti.equalsIgnoreCase("yes")) {
                antifull=fullCoverageTotal*0.05;
            }else {
                antifull=0;
            }if (accidents.equalsIgnoreCase("yes")){
                accidentsfull=fullCoverageTotal*0.15;
            }else {
                accidentsfull=-fullCoverageTotal*(-0.1);
            }if(married.equalsIgnoreCase("yes")){
                marriedfull=fullCoverageTotal*(-0.05);
            }else {
                marriedfull=0;
            }
            System.out.println("total incurence cost:"+(fullCoverageTotal+antifull+accidentsfull+marriedfull));

        }


        input.close();






    }
}
/*
Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */