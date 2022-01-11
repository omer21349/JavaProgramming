package day14_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Split or no split:");
        String split= input.nextLine();

        System.out.println("Number of People:");
        int people= input.nextInt();

        System.out.println("Enter the check amount:");
        int check= input.nextInt();
        input.nextLine();

        System.out.println("How was the srvice quality:");
        String service= input.nextLine();
        String n="No",
                y="Yes",
                poor="Poor",
                fair="Fair",
                good="Good",
                great="Great",
                excellent="Excellent";

        double t1= check*0.05,
                t2=check*0.10,
                t3=check*0.15,
                t4=check*0.20,
                t5=check*0.25;


        if(split.equals(n)) {
            if (service.equals(poor)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t1) + "\n" + "Total tip: " + t1);
            } else if (service.equals(fair)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t2) + "\n" + "Total tip: " + t2);
            } else if (service.equals(good)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t3) + "\n" + "Total tip: " + t3);
            } else if (service.equals(great)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t4) + "\n" + "Total tip: " + t4);
            } else {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t5) + "\n" + "Total tip: " + t5);
            }
        }else {
            if (service.equals(poor)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t1) + "\n" + "Total tip: " + (t1)+"\n"+"Total per person: "+((check+t1)/people)+"\n"+"Tip per person: "+(t5/people));
            } else if (service.equals(fair)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t2) + "\n" + "Total tip: " + (t2)+"\n"+"Total per person: "+((check+t2)/people)+"\n"+"Tip per person: "+(t5/people));
            }else if (service.equals(good)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t3) + "\n" + "Total tip: " + (t3) +"\n"+"Total per person: "+((check+t3)/people)+"\n"+"Tip per person: "+(t5/people));
            }else if (service.equals(great)) {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t4) + "\n" + "Total tip: " + (t4)+"\n"+"Total per person: "+((check+t4)/people)+"\n"+"Tip per person: "+(t5/people));
            }else {
                System.out.println("Number of people entered: " + people + "\n" + "Total to pay: " + (check + t5)+ "\n" + "Total tip: " +(t5)+"\n"+"Total per person: "+((check+t5)/people)+"\n"+"Tip per person: "+(t5/people));
            }
        }

        input.close();

    }
}
/*
Create a class called TipCalculator, write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
 */
