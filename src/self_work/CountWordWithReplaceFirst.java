package self_work;

import java.util.Scanner;

public class CountWordWithReplaceFirst {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence=input.nextLine();
        System.out.println("enter a word");
        String word=input.nextLine();
       /* String a=sentence.replaceAll(word,"");
        int result=(sentence.length()-a.length())/word.length();
        System.out.println(result);
        */
        /*int count=0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains(word)){
                count++;
            } sentence=sentence.replaceFirst(word,"");

        }
        System.out.println(count);*/
        int count=0;
        while(sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,"");
        }
        System.out.println(count);


        input.close();
    }
}
