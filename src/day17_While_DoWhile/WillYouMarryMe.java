package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("will you merry me?");
        String word = input.nextLine();
        while (!(word.equals("yes")||word.equals("no"))){
            System.out.println("invalid word. Please re-enter the word");
            word = input.nextLine();
        }if (word.equals("yes")){
            System.out.println("congralation");
        }else{
            System.out.println("maybe next time");
        }
        input.close();

    }
}
