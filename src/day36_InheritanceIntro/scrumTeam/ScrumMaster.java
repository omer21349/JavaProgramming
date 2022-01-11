package day36_InheritanceIntro.scrumTeam;

public class ScrumMaster extends Person{
    public int id;
    public String jobTitle;
    public double salary;

    public ScrumMaster(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
