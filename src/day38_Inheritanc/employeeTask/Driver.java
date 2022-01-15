package day38_Inheritanc.employeeTask;

public class Driver extends Employee{
    public Driver(String name, int age, char gender, int id, String jobTitle, int salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    public void work(){
        System.out.println(name+" is driving");
    }

}
