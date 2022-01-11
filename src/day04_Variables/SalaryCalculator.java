package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours= 40;
        int numberOfWeek=52;

        int salary= hourlyRate * weeklyHours * numberOfWeek;
        System.out.println("salary = " + salary);
    }
}
