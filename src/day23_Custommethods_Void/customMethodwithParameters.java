package day23_Custommethods_Void;

public class customMethodwithParameters {

    public static void main(String[] args) {

        oddEven(11);




    }


    public static void oddEven(int number){

        if (number%2==0){
            System.out.println(number+" is Even number");
        }else {
            System.out.println(number+" is odd number");
        }

        ageOfThePerson(1991);

        System.out.println("-------------------------------------------------------");


           printNumbers(10 ,50);


    }

    public static void ageOfThePerson(int beardYear){

        int age=2021 -beardYear;

        System.out.println("your age is: "+age);

    }

      public static void printNumbers(int x, int y){

          for (int i = x; i <= y; i++) {
              System.out.println(i);
          }
      }





}
