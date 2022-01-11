package day21_ForEachLoop;

public class sumNum {
    public static void main(String[] args) {

        int num[] ={50,30};
        double sum=0;
        for (int each:num){
            sum+=each;
        }
        System.out.println(sum/num.length);

    }
}
