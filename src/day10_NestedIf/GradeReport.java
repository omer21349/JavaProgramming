package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score =91;
        String b;
        if(score>=0 &&score<=100){

            if (score>=90){
                b="Excellent";
            }
            else if (score>=80){
                b="Great";
            }
            else if (score>=70){
                b="Good";
            }
            else if (score>=60){
                b="Passed";
            }
            else{
                b="Failed";
            }
        }
        else {
            b="Invalid Score";
        }
        System.out.println(b);






    }
}
