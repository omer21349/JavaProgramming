package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1= +25;  // "+" is optional because its always positive no metter writing "+"
        int num2= -25;

        System.out.println( num1 < 0);// false
        System.out.println( num2 <0 ); // true


        System.out.println("---------------------------");

        int a =5;
        ++a;  //pre increment; increases the value by 1 right away

        System.out.println(a);

        --a; // decreases the value by 1 right away
        System.out.println(a);

        System.out.println("--------------------");

        int b = 100;

        System.out.println(++b); // pre increment: increase the value by 1 right away

        int c = 100;

        System.out.println(c++); // post increment: once sayiyi ilk haline getirir sonra bir artirir
        System.out.println(c);  // yani iki adimdan olusue.

        System.out.println("-----------------------------");

        int x = 200;

        System.out.println(--x);  // pre decrement

        int y = 200;

        System.out.println(y--); // post decrement: as i said it has 2 steps
        System.out.println(y);

        System.out.println("------------------------------");

        int z = 45;

        System.out.println(++z); // pre its gonna be 46
        System.out.println(z++); //post its gonna be same 46
        System.out.println(z);   // post its gonna be 47


        System.out.println("--------------");

        int q = 30;

        System.out.println(--q); // pre, q = 29
        System.out.println(q--);// post, q = 29
        System.out.println(q);  // post, q = 28

    }
}
