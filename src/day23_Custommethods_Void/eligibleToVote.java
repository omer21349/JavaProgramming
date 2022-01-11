package day23_Custommethods_Void;



public class eligibleToVote {
    public static void main(String[] args) {
eligibleToVote(18,"yes");
    }

    public static void eligibleToVote(int age,String citizen) {



        String result="";
        if(age>=18){
            if(citizen.equals("yes")){
                result="You are eligible to vote";
            }else{
                result="You are not eligible to vote";
            }
        }else {
            result="You are not eligible to vote";

        }
        System.out.println(result);



    }
}
/*
create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!

 */