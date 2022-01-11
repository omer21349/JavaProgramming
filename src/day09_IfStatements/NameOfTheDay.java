package day09_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {
        int day = 9;

        boolean first = day == 1,
                second = day == 2,
                third = day == 3,
                fourth = day == 4,
                fifth = day == 5,
                sixth= day== 6,
                seventh = day ==7;
        if(first){
            System.out.println("monday");
        }
        else if(second){
            System.out.println("tuesday");
        }
        else if(third){
            System.out.println("wednesday");
        }
        else if(fourth){
            System.out.println("thursday");
        }
        else if(fifth){
            System.out.println("friday");
        }
        else if(sixth){
            System.out.println("saturday");
        }
        else if (seventh){
            System.out.println("sunday");
        }
        else {
            System.out.println("invailed");
        }


        System.out.println("-------------------------------------------");

        // this is gonna be another way to do same example

        int day2= 7;
        String name;

        if(day2==1){
            name="monday";
        }
        else if(day2==2){
            name="tuesday";
        }
        else if (day2==3){
            name="wetnesday";
        }
        else if (day2==4){
            name="thursday";
        }
        else if (day2==5){
            name="friday";
        }
        else if (day2==6){
            name="saturday";
        }
        else if (day2==7){
            name="sunday";
        }
        else{
            name="invalid";
        }
        System.out.println(name);

    }
}

/*
Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7
 */