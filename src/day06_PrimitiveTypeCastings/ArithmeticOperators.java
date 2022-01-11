package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10+20);
        System.out.println(100-50);
        System.out.println(10*6);

        System.out.println(100.0/3); // kusuratli sonuclarda bolen veya bolunen kesirliyazilmaliki sonucu kesirli versin.
        System.out.println(100d/3);  // veya (100d/3) yazarakta olur.
        System.out.println((double)100/3); //veya ((double)100/3) yazarakta olur.

        int  a= 100;
        double b = a/6; //burda kusuratin dogru olmamasinin sebebi bolum veye bolenin double atanmamasi.

        System.out.println(b);

        double c = a/6d;

        System.out.println(c);
    }
}


/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
    %: Remainder
 */