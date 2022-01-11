package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int number= 100;

        System.out.println("number =" + number); //100

        number = 200; // burada int yazmamamizin sebebi yukarda ayni siradaki ve ayni isimdeki atadigimiz degerden dolayi

        System.out.println("number =" + number); //200

        System.out.println("--------------------------");

        String word = "Java Programing";

        System.out.println("word= " + word);

        word = "Wooden Spoon"; // we dont need to use again string because we are upgrading

        System.out.println("word= " + word);

        System.out.println("--------------------------");

        int x = 100;

        System.out.println(x + 200);

        x += 200; //// u can use "+x" its short cut.

        System.out.println(x);

        System.out.println("-------------------");

        String str = "Wooden ";

        str += "spoon";

        System.out.println(str);

        System.out.println("--------------------------");

        double num1 = 2.5;

        System.out.println("num1 = " + num1); // 2.5

        num1 += 5.5;

        System.out.println("num1 = " + num1 ); // 8.0

        System.out.println("---------------");

        double availableBalance = 1000.50;

        //deposit 300$
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-------------------------");

        // withdrawing 500$

        availableBalance -= 500; // availableBalance = 1300.5 - 500

        System.out.println("availableBalance = " + availableBalance);

        // withdrawing 200$ -= 200, then depositing 400$

        availableBalance -= 200; // availableBalance = 6005
        availableBalance += 400; // availableBalance =1000.5

        System.out.println("availableBalance = " + availableBalance);

        System.out.println(" -------------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        System.out.println("--------------------");

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " +doge);

        System.out.println("-----------------------");

        double num2 = 25000.0;
        num2 /= 2 ;

        System.out.println("num2 = " +num2);

        System.out.println("---------------------------------");

        double num3 = 100;

        // %=

        num3 %= 3;

        System.out.println("num3 = " +num3); // num3 = 1 kalani veriyor.

        System.out.println("---------------------------------");

        int amount = 127; // cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("centes = " + cents);

        System.out.println("---------------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " +y);


        System.out.println("---------------------");

        int balance= 3500;

        // insurance fee: $153

        balance %= 153;

        System.out.println("balance = " + balance); // 134 = burada eger her ay 153 odersek 134 hesapta kalacak





    }
}
