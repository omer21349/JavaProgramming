package day20_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class maxAndMinSameTime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int numbers[] =new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i]=input.nextInt();
        }

        int max=numbers[0];
        int min=numbers[0];

        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        input.close();
    }
}
