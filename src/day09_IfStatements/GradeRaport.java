package day09_IfStatements;

public class GradeRaport {
    public static void main(String[] args) {
        int point= 65;
        char my;


        if(point>89 && point<=100){
            my = 'A';
        }
        else if(point>79 && point<90) {
            my = 'B';
        }
        else if (point>69 && point<80) {
            my = 'C';
        }
        else if(point>49 && point<70) {
            my = 'D';
        }
        else {
            my= 'F';
        }
        System.out.println(my);
    }
}


/*

90 100 arasi a
80 89 arasi b
70 79 arasi c
60 69 arasi d
0 50 arasi  f

score >= 90 && score <= 100;
        boolean b = score >= 80 && score < 90;// also i can say "score>= 80 && !a"
        boolean c = score >= 70 && score < 80;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
 */
