package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter His/Her Hourly Rate: ");
        double rate= input.nextInt();

        System.out.println("How many hours he/she work in a week: ");
        double hours = input.nextInt();

        System.out.println("Enter the stat tax ");
        double stateTax= input.nextDouble();

        System.out.println("Enter the federal tax");
        double federalTax= input.nextDouble();

        double salary= rate * hours * 52;

        double stateTaxis= salary* stateTax,
                federalTexIs= salary*federalTax,
                totalTex= stateTaxis+federalTexIs,
                inCome= salary-stateTaxis-federalTexIs;


        System.out.println("Salary: "+ salary+"\n"+"State tax: " +stateTaxis+"\n"+"Federal tax: " +federalTexIs+"\n"+"Federal tax: " +federalTexIs+"\n"+"Total tax: " + totalTex+"\n"+"Net in come: " + inCome );


        input.close();





    }
}

/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome


 */
