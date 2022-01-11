package day35_OOP_Encapsulation.scramTask;

public class Tester {
    private String name;
    private int employeeID;
    private String jobTitle;
    private int salary;

    public  Tester(String name, int employeeID,String jobTitle,int salary){
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int employeeID){
        if(employeeID<=0){
            System.err.println("invalid ID: "+employeeID);
            return;
        }
        this.employeeID=employeeID;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        if(salary<0){
            System.err.println("invalid salary: "+salary);
            return;
        }
        this.salary=salary;
    }
    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" creating ticket");
    }
    public void dailyStandUp(){
        System.out.println(name+" at daily standUp");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Scrum Task:
	create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

	create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fileds

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()

	create a class called ScrumTeam
	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

	             Actions:
	                  addTester(Tester tester): adds the given tester to the testers ArrayList

	                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

	                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

	                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList

	                  removeTester(long employeeID): removes the given tester from the testers ArrayList

	                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList

	                  toString(): prints number of tester,& developers,  PO name, SM name, BA name


	create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */

