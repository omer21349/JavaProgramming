package day36_InheritanceIntro.scrumTeam;

public class ProductOwner extends Person{
    public int id;
    public String jobTitle;
    public double salary;


    public ProductOwner(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "ProductOwner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
