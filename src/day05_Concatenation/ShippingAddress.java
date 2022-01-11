package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Omer Guven",
                buildingNumber = "175555A",
                streetName = "Gulhane",
                city = "Orlando",
                state = "FL",
                zipCode = "21325A";

        String acces = name + "\n" + buildingNumber + " " + streetName + "\n" + city + "," + " " + state + " " + zipCode ;



        System.out.println(acces);




    }
}

/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address
 */
