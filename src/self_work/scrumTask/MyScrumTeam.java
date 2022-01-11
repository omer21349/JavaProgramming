package self_work.scrumTask;



import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000);
        Tester tester3 = new Tester("Alex", 44, "SE", 135000);
        Tester tester4 = new Tester("Lala", 23, "SDET", 115000);

        Tester[] testlist = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Olga", 22, "Java developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Sinem", 13, "Senior Developer", 200000);
        Developer developer4 = new Developer("Muhtar", 9, " Senior Engineer", 250000);

        Developer[] devList = {developer1, developer2, developer3, developer4};


        ScrumTeam scrumTeam1 = new ScrumTeam("hasan", "cengiz", "ayse", 14);
        //scrumTeam1.addTester(tester1);
        System.out.println(scrumTeam1);
        scrumTeam1.addTesters(testlist);
        scrumTeam1.addDevelopers(devList);

        System.out.println(scrumTeam1);

        System.out.println("-------------------------------------------------------------------------------");

        for (Tester each : scrumTeam1.testersList) {
            System.out.println(each.name+": "+each.salary);
        }
        for (Developer each : scrumTeam1.devopsList) {
            System.out.println(each.name+": "+each.salary);
        }

        scrumTeam1.removeTester(23);
        scrumTeam1.removeDeveloper(9);
        System.out.println(scrumTeam1);

    }

}
/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */