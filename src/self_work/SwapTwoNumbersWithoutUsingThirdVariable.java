package self_work;

public class SwapTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {

        int a=10;
        int b=20;

         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println("a= "+a+"\n"+"b= "+b);

    }
}
