package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        //Full name of the person is ______
        System.out.println("Full name of the person is " + fullName);

        // __ is __ years old
        System.out.println(fullName + " is " + age + " years old");

        //FullName is JobTitle, work at CompanyName, and FullName salary is salary
        System.out.println(fullName + " is " + jobTitle + ", work at " + companyName + ", and " + fullName + "'s salary is $" + salary );

    }
}
