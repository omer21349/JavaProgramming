package day20_Arrays;

public class CharArrays {
    public static void main(String[] args) {
        char ch[]={'a','a','a','a','b','b','c'};


        for (int i = 0; i < ch.length; i++) {
            char element=ch[i];
            int counter=0;
            for (int j = 0; j < ch.length; j++) {
               if (ch[j]==element){
                   counter++;
               }
            }if (counter==2){
                System.out.println(element);
                break;
            }


        }


    }
}
