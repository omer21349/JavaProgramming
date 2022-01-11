package self_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudensObject {
    public static void main(String[] args) {

        Students student1 =new Students();
        student1.studentInfo("ali","guzel", 'M',19,"alaska");

        Students student2= new Students();
        student2.studentInfo("ayse","karaaslan",'F',23,"izmir");

        Students student3 =new Students();
        student3.studentInfo("cemal","karniyarik",'M',21,"mus");


        student1.study();
        student3.takeBreak();

        ArrayList<Students>list=new ArrayList<>(Arrays.asList(student1,student2,student3));


        for (Students students : list) {
            if(students.age<21){
                System.out.println(students.name+" you out");
            }else {
                System.out.println(students.name+" you are good");
            }
        }

        //list.removeIf(p-> !p.name.equals("ayse"));

       // System.out.println(list);




    }
}
