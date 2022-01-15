package day39_Recap.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, int salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+" is working");
    }

}
