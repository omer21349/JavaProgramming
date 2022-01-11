package day36_InheritanceIntro.scrumTeam;



public class AmazonInc {
    public static void main(String[] args) {

        ScrumTeam scrumTeam=new ScrumTeam("ayse","hasan","veli");

        Tester tester1=new Tester("Alex",44,'M',1541,"SE",135000);
        Tester tester2=new Tester("Joe",11,'M',2541,"QA",110000);
        Tester tester3=new Tester("Ali",43,'F',4741,"SDET",142000);
        Tester tester4=new Tester("Kyle", 23,'M',7841,"SDET",115000);

        Tester[]testers={tester2,tester3,tester4};

        Developer developer1=new Developer("Olga",22,'M',1222,"Java developer",125000);
        Developer developer2=new Developer("Chelsy", 39,'F', 452,"Java Master", 185000);
        Developer developer3=new Developer("Mahmut", 13, 'M',7554,"Senior Developer",200000);
        Developer developer4=new Developer("Veli", 9,'M', 547751," Senior Engineer", 250000);
        Developer developer5=new Developer("Anna",22,'F',1222,"Java developer",125000);
        Developer[]developers={developer2,developer3,developer4,developer5};

        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDevelopers(developers);
        System.out.println(scrumTeam);




    }
}
