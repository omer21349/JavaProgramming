package day35_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1=new Candy("m&m",2,0,true);
        Candy candy2=new Candy("albeny",2,5,false);
        Candy candy3=new Candy("ulker",4,8,false);
        Candy candy4=new Candy("eti",5,9,true);
        Candy candy5=new Candy("sarrale",6,5,true);

        ArrayList<Candy> candies=new ArrayList<>(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        for (Candy candy : candies) {
            String result=(candy.getPrice()==0)?"free":String.valueOf(candy.getPrice());
            System.out.println(candy.getBrand()+": "+result);
        }
    }
}
