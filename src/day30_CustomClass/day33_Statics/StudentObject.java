package day30_CustomClass.day33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1= new Student("Ahmet");
        System.out.println(student1);

        Student student2= new Student("aygun",'F');

        Student student3=new Student("nigara",11);

        Student student4=new Student("mert",12,'A');

        Student student5=new Student("cihad",'M',28);

        Student student6=new Student("suhaib",'M',27,15);

        Student student7=new Student("ali",'M',42,244445,'A');

        Student[] students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));






    }
}
