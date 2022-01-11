package day08_IfStatements;

public class GreadeReport {
    public static void main(String[] args) {

        int score = 20;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score < 90;// also i can say "score>= 80 && !a"
        boolean c = score >= 70 && score < 80;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;

        if (a) {
            System.out.println("Excelent");

        }
        if (b) {
            System.out.println("Great");
        }
        if (c) {
            System.out.println("good");

        }
        if(d){
            System.out.println("passed");

        }
        if(f){
            System.out.println("failed");
        }
    }
}
