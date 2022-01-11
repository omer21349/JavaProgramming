package day17_While_DoWhile;

import java.util.Scanner;

public class frequencOfWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a java word");
        String word= input.nextLine();
        int b=0;
        for (int i = 0; i <= word.length()-4; i++) {
            String a= word.substring(i,i+4);
            if(a.equals("java")){
                b++;
            }


        }System.out.println(b);
        input.close();


    }


}
