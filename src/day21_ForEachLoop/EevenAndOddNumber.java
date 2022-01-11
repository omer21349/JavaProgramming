package day21_ForEachLoop;

public class EevenAndOddNumber {
    public static void main(String[] args) {

        int num[]={1,5,6,7,4,12,9,16,84};
        int even=0;
        int odd=0;
        for (int each : num) {
            if(each%2==0){
                even++;
            }
            if(each%2==1) {
                odd++;
            }
        }
        System.out.println("Even number: "+even+"\n"+"Odd number: "+odd);


    }
}
/*
Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */