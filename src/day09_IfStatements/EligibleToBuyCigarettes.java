package day09_IfStatements;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {
        String person= "Ali";
        byte age= 25;

        boolean eligible = age>=18;
        System.out.println(person+ " eligible to buy Cigarettes: " + eligible);


    }
}

/*
Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */