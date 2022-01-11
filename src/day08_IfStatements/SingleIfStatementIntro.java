package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number= 301;

        boolean evenNumber = number%2 == 0;
        //boolean oddNumber = number%2 !=0; (bu sekildede calisir, ikinci yol olarak )
        boolean oddNumber = !evenNumber;

        if (evenNumber) {

            System.out.println(number +" even Number");
        }
        if (oddNumber) {
            System.out.println(number + " odd Number");

            System.out.println("------------------------------------------");

            int  a = -5;

            if(a>0) {
                System.out.println(a + " pozitif");
            }
            if(a<0){
                System.out.println(a+ " negative");
            }
            if(a==0){
                System.out.println(a + " zero");
            }


        }

    }
}

