package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

    char letter[]=new char[26];

        for (char j=0,i = 'A';j<=letter.length-1&& i <='Z' ; i++,j++) {
            letter[j]=i;
        }

        System.out.println(Arrays.toString(letter));


        System.out.println("-----------------------------------------------------------------------------------");
        //anather way to do
        char letter2[]=new char[26];
        char a='A';
        for (int j=0; j<=letter2.length-1;j++) {
            letter2[j]=a++;
        }

        System.out.println(Arrays.toString(letter2));

        System.out.println("------------------------------------------------------------------------------");

        char letter3[]=new char[26];

        for (int j=0,i = 'Z'; j<=letter3.length-1 && i >='A' ;j++, i--) {
            letter3[j]=(char)i;
        }

        System.out.println(Arrays.toString(letter3));
    }
}
