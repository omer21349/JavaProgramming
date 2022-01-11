package day24_CustomMethods_Return;

public class ReturnMaximumArray {
    public static void main(String[] args) {
        int arry[]={1,5,9,50,8,10,4};
        System.out.println(maxNumber(arry));
    }

    public static int maxNumber(int []ar){

        int num=ar[0];
        for (int i : ar) {
            if(i>num){
                num=i;
            }
        }return num;


    }
}
