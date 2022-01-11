package day15_ForLoop;

public class ReturnOddnum {
    public static void main(String[] args) {
        int num=0;
        for (int i = 0; i <100; i++) {

            if(i%2==1){
                num+=i;
            }
        } System.out.println(num);
    }
}

/*
Write a program that can return the sum of odd numbers between 1 to 100
 */
