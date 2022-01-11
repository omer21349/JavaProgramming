package self_work;

import java.util.ArrayList;
import java.util.Arrays;

public class omer {
    public static void main(String[] args) {
        String a="omerguven";

        char b[]=a.toCharArray();

       for (int i = 0; i < b.length; i++) {
            char temp =b[0];
              b[0]= b[3];
              b[3]= temp;
        }

        System.out.println(b);

       /*String result="";
        for (char c : b) {
            result+=c;
        }
        System.out.println(result);*/


    }
}
