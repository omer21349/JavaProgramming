package day09_IfStatements;

public class SchoolType {
    public static void main(String[]args){

        byte student= 13;

        boolean kids1= student>0 && 6>student,
                kids2= student>5 && 9>student,
                kids3= student>8 && 13>student,
                kids4= student>12 && 17>student,
                kids5= student>16 && 19>student;

        if (kids1){
            System.out.println("Elementry school");
        }
        if (kids2){
            System.out.println("Middle school");
        }
        if (kids3){
            System.out.println("High school");
        }
        if (kids4){
            System.out.println("College");
        }
        if (kids5){
            System.out.println("Grad School");
        }




    }
}

/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */
