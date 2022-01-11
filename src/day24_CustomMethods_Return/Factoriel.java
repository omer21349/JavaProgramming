package day24_CustomMethods_Return;

public class Factoriel {
    public static void main(String[] args) {

        int f=4;
        int a=factoriyel(f);
        System.out.println(a);
    }
    public static int factoriyel(int num){

        int fact=1;
        for (int i =num ; i>0 ; i--) {
            fact*=i;
        }

        return fact;


    }

}
