package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String>list= new ArrayList<>();

        list.add("java");
        list.add("java");
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("c#");
        list.add("ruby");
        list.add("c++");
        list.add("c++");
        ArrayList<String>unique= new ArrayList<>();
        for (String s : list) {
            if(list.indexOf(s)== list.lastIndexOf(s)){
                unique.add(s);
            }
        }System.out.println(unique);





    }
}
