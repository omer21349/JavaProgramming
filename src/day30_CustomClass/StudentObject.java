package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("omer",'M',30,21200,'A');

        Student student2=new Student();
        student2.setInfo("Hasan",'M',24,252441,'B');

        Student student3=new Student();
        student3.setInfo("Ayse",'F',27,252457,'A');

        Student student4=new Student();
        student4.setInfo("Hakan",'M',24,252441,'B');

        Student student5=new Student();
        student5.setInfo("Mehmet",'M',24,252441,'B');
       // System.out.println(student1+"\n"+student2);


        Student[]students={student1,student2,student3,student4,student5};

        ArrayList<Student>earlyBird=new ArrayList<>();
        ArrayList<Student>angryBird=new ArrayList<>(Arrays.asList(students));
        for (Student each : students) {
            if(each.grade=='A'){
               earlyBird.add(each);
            }
        }
       System.out.println(earlyBird);
        angryBird.removeIf(p-> p.grade=='A');
        System.out.println(angryBird);











    }
}
