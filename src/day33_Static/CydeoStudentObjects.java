package day33_Static;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student=new CydeoStudent("ali",23,324,'A',23,2);

        System.out.println(student);

        student.printProgLanguage();
        student.printSchoolName();
        student.study();



    }
}
