package day24_CustomMethods_Return;

public class returnmethodpractice {
    public static void main(String[] args) {

        int a= maxnum(100,200);
        System.out.println(a);

        int b=a*2;// u can use again.
        System.out.println(b);
    }
    public static int maxnum(int a, int b){

        int max=0;
        if (a>b){
            max=a;
        }else {
            max=b;
        }

        return max;

    }
}
