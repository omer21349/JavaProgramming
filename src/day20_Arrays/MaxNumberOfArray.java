package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        int num[]={5, 50, 60,40,10};
        int max= num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);


        System.out.println("--------------------------------------------------------------");

        int num2[]={5, 50, 60,40,10};
        int max2= num2[0];
        int min= num2[0];
        for (int i = 0; i < num2.length; i++) {
            if (num2[i]<min){
                min=num2[i];
            }
            if (num2[i]>max2){
                max2=num2[i];
            }
        }
        System.out.println(min);
        System.out.println("max2 = " + max2);

    }
}
