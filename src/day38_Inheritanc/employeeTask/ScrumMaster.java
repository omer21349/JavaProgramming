package day38_Inheritanc.employeeTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int id, String jobTitle, int salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }
    public void work(){
        System.out.println(name+" creating the scrum backlog");
    }

}
