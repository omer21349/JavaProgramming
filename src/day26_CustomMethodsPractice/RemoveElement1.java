package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        arr=removeElement(arr,4);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] removeElement(int array[],int element){
        if(element<0||element> array.length-1){
            System.out.println("invalid index: " +element);
            System.exit(0);
        }
        int[]result= new int[(array.length)-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==element){
              continue;
            }result[j++]=array[i];
        }return result;
    }
}
