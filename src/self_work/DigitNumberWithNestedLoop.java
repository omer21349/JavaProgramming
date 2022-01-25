package self_work;

public class DigitNumberWithNestedLoop {
    public static void main(String[] args) {

        int num=0;

        for (int i = 1; i <=9 ; i++) {
            for (int j = 0; j <=9; j++) {
                for (int k = 0; k <=9; k++) {
                    num=100*i+10*j+k;
                    System.out.println(num);
                }
            }
        }




    }
}
