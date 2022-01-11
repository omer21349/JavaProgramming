package day24_CustomMethods_Return;

public class MinimumNumberArray {
    public static void main(String[] args) {
        int array[]={10,5,8,90,40};
        int a=minNumber(array);
        System.out.println(a);
    }
    public static int minNumber(int []num){

        int min=num[0];
        for (int i : num) {
            if(i<min){
                min=i;

            }
        }return min;


    }
}
