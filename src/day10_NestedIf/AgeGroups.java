package day10_NestedIf;

public class AgeGroups {
    public static void main(String[] args) {
        int age= 46;
        String b;

        if(age>0 && age<3){
            b="infant";
        }
        else if(age>2 && age<6){
            b="Toddler";
        }
        else if(age>5 && age<10){
            b="Kid";
        }
        else if(age>9 && age<13){
            b="Pre-Teen";
        }
        else if(age>12 && age<18){
            b="Teenager";
        }
        else if(age>17 && age<21){
            b="Young Adult";
        }
        else if(age>20 && age<40){
            b="Adult";
        }
        else if(age>39 && age<50){
            b="Young Middle-Aged Adult";
        }
        else if(age>49 && age<50){
            b="Middle-Aged Adult";
        }
        else if(age>54 && age<65){
            b="Very Young Senior Citizen";
        }
        else if(age>64 && age<75){
            b="Young Senior Citizen";
        }
        else if(age>74 && age<85){
            b="Senior Citizen";
        }
        else{
            b="Old Senior Citizen";
        }
        System.out.println(b);


    }

}

/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */
