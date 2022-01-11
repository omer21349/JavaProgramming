package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CountriesLengthOf10orGreater {
    public static void main(String[] args) {

        String []countries={"japan","korea","United Kingdom","United States","Canada"};

        //converting array to arrayList
        ArrayList<String>list= new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length()>9);

        //converting arraylist to array
        countries=list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));





    }
}
