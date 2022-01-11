package day12_Scanner;

import java.util.Scanner;

public class HowManyPeopleLiving {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("How many people living in your home: ");

        int people= input.nextInt();

        String a =(people>=0)?(people>6)?"Live with more than 6 people":(people>=3&&people<=6)?"Live with 3 - 6 people":"live less than 3 people":"invalid number";
        System.out.println(a);

        input.close();


    }
}


/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */