package day36_InheritanceIntro.employeeTask2;

public class Developer extends Employee{
    public void coding(){
        System.out.println(name+" coding");
    }
    public void fixingBugs(){
        System.out.println(name+" fixing bugs");
    }
}
