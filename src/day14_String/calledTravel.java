package day14_String;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Do you have valid passport");
        String valid= input.nextLine();
        String v="yes";

        if(valid.equals(v)) {
            System.out.println("Enter what country do you want to travel: ");
            String toTravel = input.nextLine();
            System.out.println("How many bag will you take with you:");
            byte bag = input.nextByte();
            System.out.println("How many people travel with you:");
            short people = input.nextShort();
            input.nextLine();
            System.out.println("Enter people name travel with you:");
            String name = input.nextLine();
            int ticket=1000;
            double cost1;
            int b = bag * 50;

            if (people == 0) {
                cost1 = ticket+b;
            } else if (people == 1) {
                cost1 =(ticket*2)-(100)+b;
            } else if (people == 2) {
                cost1 =(ticket*3)-(200)+b;
            } else {
                cost1 =(ticket*4)-(300)+b;
            }
            System.out.println("Your ticket is booked to "+toTravel+ ". We have charged extra for the "+bag+" bags but you are traveling with "+name+" so we are giving a discount. Your total cost is "+cost1 );
        }else {
            System.out.println("when your passport expired:");
            int pass= input.nextInt();
            input.nextLine();
            System.out.println("what country do you want to travel:");
            String coun= input.nextLine();
            System.out.println("will you travel next year:");
            String tra=input.nextLine();
            String trav="yes";
            int passportRenew=200;
            int eachYear= pass*75;
            int cost2;

            if(tra.equals(trav)){
                cost2=passportRenew+100+eachYear;
            }else {
                cost2=passportRenew-50+eachYear;
            }
            System.out.println("Looks like your password has been expired for "+pass+" years, but not to worry we will get it ready for you to travel to "+coun+". Your total cost has come out to "+cost2+".");
        }
        input.close();

    }

}

/*
Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."














 */
