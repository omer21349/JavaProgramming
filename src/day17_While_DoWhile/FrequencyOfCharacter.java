package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String str = input.nextLine();
        char a ='A';
        int num =0;
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);

            if (b==a){
                num++;
            }


        }System.out.println(num);

        input.close();


    }
}
