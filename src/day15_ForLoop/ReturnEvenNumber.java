package day15_ForLoop;

public class ReturnEvenNumber {
    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                a+=i;
            }

        }System.out.println(a);

    }
}
/*
Write a program that can return the sum of even numbers between 1 to 100
 */
