package day10_NestedIf;

public class CalculateTheSalaryAfterTax {
    public static void main(String[] args) {
        double salary = 110000,
                  a ;
        char b = 'S';


        if (b == 'M') {

            if (salary >= 130000) {
                    a = salary * 70 / 100;
            } else if (salary >= 100000) {
                    a = salary * 75 / 100;
            } else if (salary >= 800000) {
                    a = salary * 80 / 100;
            } else {
                    a = salary * 85 / 100;
                }
            }

        else {
                 if (salary >= 130000){
                     a = salary * 65 / 100;
                 }
                 else if (salary >= 100000) {
                     a = salary * 70 / 100;

                 } else if (salary >= 800000) {
                     a = salary * 75 / 100;
                 }
                 else {
                     a = salary * 80 / 100;
                 }
            }
        System.out.println(a);


        }

    }




/*
Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */