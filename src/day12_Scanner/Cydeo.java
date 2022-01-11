package day12_Scanner;

public class Cydeo {
    public static void main(String[] args) {
        String name = "US morning",
                a;

        if (name == "US morning" || name == "US evening" || name == "EU") {
            if (name == "US morning") {
                a = "Class times are 10-5 EST. M, T, Th, F.";
            } else if (name == "US evening") {
                a = "Class times are 7-10 EST. M, T, W, Th, S, S";
            } else {
                a = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else {
            a = "Invalid Btach";
        }
        System.out.println(a);


        System.out.println("-------------------------------------------------------");

        String s=  "US morning",
                c;
        if (name == "US morning" || name == "US evening" || name == "EU"){
            switch (name){
                case "US morning":
                    c="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    c="Class times are 7-10 EST. M, T, W, Th, S, S";
                default:
                    c="Class times are  10-5 EST. M, T, W, Th, F.";
            }
        }
        else{
            c = "Invalid Btach";
        }
        System.out.println(c);




    }

}


/*
Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */