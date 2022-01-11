package day35_OOP_Encapsulation.scramTask;

public class Developer {
    private String name;
    private int employeeID;
    private String jobTitle;
    private int salary;

    public Developer(String name, int employeeID, String jobTitle, int salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void coding(){
        System.out.println(name+" coding");
    }
    public void unitTesting(){
        System.out.println(name+" unit testing");
    }
    public void fixingBug(){
        System.out.println(name+" fixing bug");
    }
}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
