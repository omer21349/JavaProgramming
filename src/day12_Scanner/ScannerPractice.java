package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        // new Scanner(System.in).nextInt() bunu kullana bilirsin ama bunu kullanirsan herzaman yeni den yazmalisin.

        Scanner scan = new Scanner(System.in);// buna isim vererek o ismi kullanabilirsin. yukardakinden daha kullanisli
        System.out.println("enter a number between 1 to 7:");

        int num= scan.nextInt();
        String result="";

        if (num>=1 &&num<=7){
            result=(num==1)?"monday": (num==2)?"Tusday":(num==3)?"wednesday":
                    (num==4)?"thursday":(num==5)?"friday":(num==6)?"saturday":"sunday";

        }
        else {
            result="invalid number";
        }
        System.out.println(result);
        scan.close();

    }

}
