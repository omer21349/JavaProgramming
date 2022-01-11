package day35_OOP_Encapsulation.scramTask;


import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1=new Tester("layan",11,"QA",110000);
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4=new Tester("layan",11,"QA",110000);
        Tester tester5=new Tester("Lala", 23,"SDET",115000);

        Tester []testers={tester2,tester3,tester4,tester5};
        Developer developer1=new Developer("Olga",22,"Java developer",125000);
        Developer developer2=new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3=new Developer("Sinem", 13, "Senior Developer",200000);
        Developer developer4=new Developer("Muhtar", 9, " Senior Engineer", 250000);

        Developer[]developers={developer2,developer3,developer4};

        ScrumTeam scrumTeam=new ScrumTeam("ali","ayse","fatma",14);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);
        System.out.println(scrumTeam);





    }
}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */