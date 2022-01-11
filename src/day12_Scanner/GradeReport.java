package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter The His/Her Score: ");
        int score =input.nextInt();
        char b;

          if (score>=0&&score<=100){
              if(score>=90){
                  b= 'A';
              }
              else if(score>=80){
                  b= 'B';
              }
              else if(score>=70){
                  b='C';
              }
              else if(score>=50){
                  b='D';
              }
              else{
                  b='F';
              }
              System.out.println("Your score : "+score +"\n"+"Your grade: "+b);
          }
          else{
              System.out.println("Invalid Number");
          }











    }
}

/*
GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */