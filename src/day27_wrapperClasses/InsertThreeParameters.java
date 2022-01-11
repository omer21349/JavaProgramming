package day27_wrapperClasses;

import java.util.Arrays;

public class InsertThreeParameters {
    public static void main(String[] args) {

        int []arr = {10, 20, 30, 40, 50};
        arr=addElement(arr,2,10);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] addElement(int array[], int index,int element){
        int arr2[]=new int[array.length+1];
        int a=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(i==index) {
                arr2[index] = element;
            }else{
                arr2[i]=array[a++];
            }
    }
        return arr2;
    }
    public static double[] addElement(double array[], int index,double element){
        double arr2[]=new double[array.length+1];
        int a=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(i==index) {
                arr2[index] = element;
            }else{
                arr2[i]=array[a++];
            }
        }
        return arr2;
    }
    public static char[] addElement(char array[], int index,char element){
        char arr2[]=new char[array.length+1];
        int a=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(i==index) {
                arr2[index] = element;
            }else{
                arr2[i]=array[a++];
            }
        }
        return arr2;
    }
    public static String[] addElement(String array[], int index,String element){
        String arr2[]=new String[array.length+1];
        int a=0;
        for (int i = 0; i <arr2.length ; i++) {
            if(i==index) {
                arr2[index] = element;
            }else{
                arr2[i]=array[a++];
            }
        }
        return arr2;
    }
}

/*
Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */
