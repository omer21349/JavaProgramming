package day28_ArrayList;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {

        ArrayList<Character>characters= new ArrayList<>();

        characters.add('A');
        characters.add('W');
        characters.add('C');
        characters.add('D');
        characters.add('W');
        int a=characters.indexOf('W');
        System.out.println(a);
        int b=characters.lastIndexOf('W');
        System.out.println(b);

        boolean f=characters.contains('z');

        System.out.println(f);






    }
}
