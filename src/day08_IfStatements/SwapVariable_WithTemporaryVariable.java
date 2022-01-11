package day08_IfStatements;

public class SwapVariable_WithTemporaryVariable {
    public static void main(String[] args) {
        int a= 15,
            b=10;
        int c= b;
        b=a;
        a=c;

        System.out.println("a = " + a + "\n" + "b = " + b);


    }
}

/*
write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */
