package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String person= "Matt";
        int age = 15;

        if (age>18){
            System.out.println(person + " is eligible to vote");
        }
        else{
            System.out.println(person + " is NOT eligible to vote");
        }

    }
}
