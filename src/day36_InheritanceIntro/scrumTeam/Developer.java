package day36_InheritanceIntro.scrumTeam;

public class Developer extends Person{
    public int id;
    public String jobTitle;
    public double salary;

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
