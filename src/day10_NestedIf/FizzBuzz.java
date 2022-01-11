package day10_NestedIf;

public class FizzBuzz {
    public static void main(String[] args) {
        int num = 3;
        String a;

        if (num%3==0 && num%5==0){
            a="FizzBuzz";
        }
        else if( num%3==0){
            a="Fizz";
        }
        else if( num%5==0){
            a="Buzz";
        }
        else{
            a="wrong number";
        }
        System.out.println(a);


    }
}
