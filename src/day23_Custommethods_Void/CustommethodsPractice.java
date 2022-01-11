package day23_Custommethods_Void;

public class CustommethodsPractice {


    public static void main(String[] args) {


    reapited5times();
        System.out.println("===============================================================================");
        HelloCydeo5times();
        System.out.println("----------------------------------------------------------------------------");
        evenNumber();

    }

    public static void reapited5times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");

        }


    }
    public static void HelloCydeo5times(){

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello Cydeo");
        }

    }

    public static void evenNumber(){

        for (int i = 0; i <= 10; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }

}
