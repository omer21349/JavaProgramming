package self_work;

import java.util.Scanner;

public class CountWordWithSubstring {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence=input.nextLine();
        System.out.println("enter a word");
        String word=input.nextLine();
        String result="";
        int count=0;
        for (int i = 0; i <=sentence.length()-word.length(); i++) {
            result=sentence.substring(i,i+word.length());
            if(result.equals(word)){
                count++;
            }
        }
        System.out.println(count);


        input.close();

    }

}
