package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");

        try{
            System.out.println(9/0);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception is was occurred");
        }




        System.out.println("test completed");





    }
}
