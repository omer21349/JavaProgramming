package day10_NestedIf;

public class Loans {
    public static void main(String[] args) {
        int salary = 60000;
        int score= 650;

        String a =(salary>=60000&&score>=650)?"loan approved":"loan denied";
        System.out.println(a);



    }
}

/*
Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */
