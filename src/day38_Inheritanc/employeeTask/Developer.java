package day38_Inheritanc.employeeTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, String jobTitle, int salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }


    public void working() {
        System.out.println(name+" developing code");
    }
}
