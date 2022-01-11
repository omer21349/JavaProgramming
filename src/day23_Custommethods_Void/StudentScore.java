package day23_Custommethods_Void;

public class StudentScore {
    public static void main(String[] args) {

        StudentScore(90);
    }

    public static void StudentScore(int b){

        String a=(b<=100&&b>=0)?(b>=90)?"A":(b>=80)?"B":(b>=70)?"C":(b>=60)?"D":"F":"invalid";
        System.out.println(a);
    }
}
/*
create a method that can calculate the grade of the student based on the score
 */
