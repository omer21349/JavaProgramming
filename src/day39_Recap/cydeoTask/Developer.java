package day39_Recap.cydeoTask;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+" is working");
    }
    public void fixingBugs(){
        System.out.println(getName()+" is fixing bugs");
    }


}
