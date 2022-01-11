package day23_Custommethods_Void;

public class OddNumbers {

    public static void main(String[] args) {


   oddNumbers(1,100);
        System.out.println();
   evenNumber(1,100);


    }
    public static void oddNumbers(int x,int y){

        for (int i = x; i <y ; i++) {
           if (i%2==1){
               System.out.print(i+" ");
           }



        }

    }
    public static void evenNumber(int x,int y){

        for (int i = x; i <y ; i++) {
        if(i%2==0) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        }
    }
}
/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space

2. create a method that can print even numbers between 1~100 in a same line saperated by space
 */
