package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int num[] ={10,50,20,70,60,90,30};
         int max= num[0];
        for (int each:num){
           if(each>max){
               max=each;
           }
        } System.out.println(max);
    }
}
