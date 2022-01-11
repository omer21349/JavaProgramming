package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();

        System.out.println("Enter your gender");
        String  gender=input.next();
        input.nextLine();

        System.out.println("Enter your full name");
        String  fullName=input.nextLine();

        System.out.println("Enter your phone number");
        long number=input.nextLong();

        System.out.println("Enter your zip code");
        int zip=input.nextInt();
        input.nextLine();

        System.out.println("Enter your School name");
        String  schoolName=input.nextLine();

        System.out.println("Enter your city name");
        String  city=input.nextLine();

        System.out.println("Enter your state name");
        String  state=input.next();

        System.out.println("Enter your building number");
        int building=input.nextInt();
        input.nextLine();

        System.out.println("Enter your Street name");
        String  street=input.nextLine();

        System.out.println(fullName+"\n"+age+"\n"+gender+"\n"+number+"\n \t"+building+" "+street+"\n \t"+city+", "+state+"\n"+schoolName);

    input.close();
    }
}


/*
Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name
 */