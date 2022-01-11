package day31_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restorant1=new Restaurant("omer","miami",5);

        Server servers1=new Server("ayse",1241,12.5,true);
        Server servers2=new Server("ali",45214,12.5,false);
        Server servers3=new Server("hilal",1254874,11,true);

        Server []serAr={servers1,servers2};
        restorant1.hireServer(servers3);
        restorant1.hireServers(serAr);
        System.out.println(servers1);

        Chef chef1=new Chef("joe",487421,20,true);
        Chef chef2=new Chef("kyle",47789,20,true);
        Chef chef3=new Chef("derick",79512,25,false);
        Chef []arChef={chef2,chef3};
        restorant1.hireChef(chef1);
        restorant1.hireChefs(arChef);

        System.out.println(restorant1);










    }
}
