package day10_NestedIf;

public class EqualNumbers {
    public static void main(String[] args) {
        int num1= 50,
                num2=50,
                num3= 40;
        String b;
        if (num1==num2 && num1==num3){
            b="all equal";
        }
        else if (num1==num2){
            b="n1&n2 are equal";
        }
        else if (num3==num2){
            b="n2&n3 are equal";
        }
        else if (num1==num3){
            b="n1&n3 are equal";
        }
        else{
            b="none of them are equal";
        }
        System.out.println(b);
    }
}
