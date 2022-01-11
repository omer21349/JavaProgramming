package day23_Custommethods_Void;

public class GradeStudent {
    public static void main(String[] args) {
        CalculateGrade('A');
    }
    public static void CalculateGrade(char a){
        String b =(a>='A'&&a<='F')?(a=='A')? "excellent":(a=='B')? "Good job":(a=='C')? "good":(a=='D')?"passed":"faild":"invalid";
        System.out.println(b);
    }
}
/*
create a method that can calculate the grade of the student based on the score
 */