package day19_LoopPractices;

import java.util.Scanner;

public class IndexNumberFirstDuplicated {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a word");
        String word=input.nextLine();
        String result="";
        for (char i = 0; i < word.length(); i++) {
            char a= word.charAt(i);
            int a2= word.indexOf(a);
           int count=0;
            for (char j = 0; j < word.length(); j++) {
                char b= word.charAt(j);
                int b2=word.indexOf(b);
                if(a2==b2){
                    count++;
                }

            }if(count>1){
                result+=a2;
                break;
            }


        }


        System.out.println(result);
        input.close();


    }
}
    /*Write a program that cna return the index number of the first duplicated character from a string*/
