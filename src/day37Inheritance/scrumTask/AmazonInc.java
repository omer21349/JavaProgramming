package day37Inheritance.scrumTask;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        String company= "Amazon Inc";
        ProductOwner productOwner=new ProductOwner("Shaib",29,'M',1,160000,company);

        BusinessAnalyst businessAnalyst=new BusinessAnalyst("cihad",30,'M',2,150000,company);

        ScrumMaster scrumMaster= new ScrumMaster("anel",26,'F',3,1450000,company);
        Tester tester1=new Tester("Alex",44,'M',1541,"SE",135000,company);
        Tester tester2=new Tester("Joe",11,'M',2541,"QA",110000,company);
        Tester tester3=new Tester("Ali",43,'F',4741,"SDET",142000,company);
        Tester tester4=new Tester("Kyle", 23,'M',7841,"SDET",115000,company);
        Tester []testers={tester2,tester3,tester4};

        Developer developer1=new Developer("Olga",22,'M',1222,"Java developer",125000,company);
        Developer developer2=new Developer("Chelsy", 39,'F', 452,"Java Master", 185000,company);
        Developer developer3=new Developer("Mahmut", 13, 'M',7554,"Senior Developer",200000,company);
        Developer developer4=new Developer("Veli", 9,'M', 547751," Senior Engineer", 250000,company);
        Developer developer5=new Developer("Anna",22,'F',1222,"Java developer",125000,company);

        Developer []developers={developer2,developer3,developer4,developer5};

        
        ScrumTeam scrumTeam=new ScrumTeam(productOwner,businessAnalyst,scrumMaster);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDevelopers(developers);
        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);


        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);
        }












    }
}
