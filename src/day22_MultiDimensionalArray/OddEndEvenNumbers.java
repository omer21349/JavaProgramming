package day22_MultiDimensionalArray;

public class OddEndEvenNumbers {
    public static void main(String[] args) {

        int [][] arr2d={{1,2,3,},{4,5,6,7},{8,9,10,11,12}};
        String odd ="", even ="";
        for (int[] num2 : arr2d) {

            for (int num1 : num2) {
                if(num1%2==0){
                    even+=num1+" ";
                }if (num1%2==1){
                   odd+=num1+" ";
                }


            }
        }System.out.print("even number: "+even+"\n"+"odd number: "+odd);
    }
}

/*
Write a program that can count the total odd and even numbers from a two dimensional array
 */