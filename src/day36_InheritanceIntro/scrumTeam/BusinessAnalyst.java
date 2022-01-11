package day36_InheritanceIntro.scrumTeam;

public class BusinessAnalyst extends Person{
    public int id;
    public String jobTitle;
    public double salary;

    public BusinessAnalyst(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "BusinessAnalyst{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
