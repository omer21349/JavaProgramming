import java.util.Arrays;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

    public void study() {
        System.out.println(name + " studying");
    }

}


    class StudentObject {
        public static void main(String[] args) {
            day30_CustomClass.day33_Statics.Student student1 = new day30_CustomClass.day33_Statics.Student("Ahmet");
            System.out.println(student1);

            day30_CustomClass.day33_Statics.Student student2 = new day30_CustomClass.day33_Statics.Student("aygun", 'F');

            day30_CustomClass.day33_Statics.Student student3 = new day30_CustomClass.day33_Statics.Student("nigara", 11);

            day30_CustomClass.day33_Statics.Student student4 = new day30_CustomClass.day33_Statics.Student("mert", 12, 'A');

            day30_CustomClass.day33_Statics.Student student5 = new day30_CustomClass.day33_Statics.Student("cihad", 'M', 28);

            day30_CustomClass.day33_Statics.Student student6 = new day30_CustomClass.day33_Statics.Student("suhaib", 'M', 27, 15);

            day30_CustomClass.day33_Statics.Student student7 = new day30_CustomClass.day33_Statics.Student("ali", 'M', 42, 244445, 'A');

            day30_CustomClass.day33_Statics.Student[] students = {student1, student2, student3, student4, student5, student6, student7};

            System.out.println(Arrays.toString(students));


        }
    }