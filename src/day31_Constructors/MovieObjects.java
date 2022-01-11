package day31_Constructors;

import java.util.ArrayList;

public class MovieObjects {
    public static void main(String[] args) {

        Movie movie1=new Movie("USA","Journey to SDET: Cydeo Batch 23","10/25/2021","Kuzzat Altay");

       movie1.addCast("Asiya");

        String cast[]={"Adam", "Muhtar","ali","veli","hasan","kenan"};

        movie1.addCasts(cast);
        System.out.println(movie1);





    }
}
