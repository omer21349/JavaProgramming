package day21_ForEachLoop;

import java.util.Arrays;

public class AppearanceJavaAndPython {
    public static void main(String[] args) {
        String word ="We study java not python java is best";

        String spli[]= word.split(" ");
        int count1=0;
        int count2=0;
        for (String each : spli) {
            if(each.equals("java")) {
                count1++;
            }
            if(each.equals("python")){
                count2++;
            }
        }
        System.out.println("java: "+count1+"\n"+"python: "+count2);





    }
}

/*
Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */
