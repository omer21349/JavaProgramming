package day12_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String name="tall",
                b;

        if(name=="tall"||name=="grande"||name=="venti"){
            if(name=="tall"){
                b="price is $3.69+"+"\n" +"90 calories";
            }
            else if (name=="grande"){
                b="price is $3.99"+"\n"+"120 calories";
            }
            else{
                b="price is $4.29"+"\n"+"150 calories";
            }

        }
        else {
            b="Invalid Size";
        }
        System.out.println(b);

        System.out.println("---------------------------------------------");

        String size="venti",
                a;
        if (size=="tall"||size=="grande"||size=="venti"){
            switch (size){
                case "tall":
                    b="price is $3.69+"+"\n" +"90 calories";
                    break;
                case "grande":
                    b="price is $3.99"+"\n"+"120 calories";
                    break;
                default:
                    b="price is $4.29"+"\n"+"150 calories";

            }

        }
        else{
            b="invalid size";
        }
        System.out.println(b);


    }
}


/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */