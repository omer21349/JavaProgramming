package day30_CustomClass;

public class Employee {

    public String name;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;




    public void setInfo(String name, int ID, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", ID=" + ID +
                    ", jobTitle='" + jobTitle + '\'' +
                    ", salary=" + salary +
                    ", isFullTime=" + isFullTime +
                    '}';
        }

        public void working(){
            System.out.println(name+" is working...");
        }
        public void takeBreak(){
            System.out.println(name+" is taking break...");
        }




}
