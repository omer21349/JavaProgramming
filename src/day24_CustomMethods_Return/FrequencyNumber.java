package day24_CustomMethods_Return;

import java.util.Arrays;

public class FrequencyNumber {
    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,2,2};
        int a=1;
        System.out.println(frequencyNumber(array,a));
    }
    public static int frequencyNumber(int []ar,int num){
        int cout=0;
        for (int i : ar) {
            if(i==num){
                cout++;
            }
        }return cout;
    }
}

/*
create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */
