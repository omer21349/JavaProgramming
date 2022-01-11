package day21_ForEachLoop;

public class minNumber {
    public static void main(String[] args) {
        int num[] ={50,20,70,60,90,30};
        int min =num[0];
        for (int each:num){
            if (each<min){
                min=each;
            }
        }
        System.out.println(min);


    }
}
