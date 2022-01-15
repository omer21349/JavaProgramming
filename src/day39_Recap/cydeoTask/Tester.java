package day39_Recap.cydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
    public void crateTicket(){
        System.out.println(getName()+" is creating ticket");
    }
}
