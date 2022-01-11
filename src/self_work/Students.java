package self_work;

public class Students {

    public String name;
    public String lastName;
    public char gender;
    public int age;
    public String whereFrom;

    public void studentInfo(String name, String lastName, char gender, int age, String whereFrom) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.whereFrom = whereFrom;
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", whereFrom='" + whereFrom + '\'' +
                '}';
    }
    public void study(){
        System.out.println(name+" studying");
    }
    public void takeBreak(){
        System.out.println(name+" taking break...");
    }


}
