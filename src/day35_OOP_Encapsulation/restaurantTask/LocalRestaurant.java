package day35_OOP_Encapsulation.restaurantTask;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant=new Restaurant("omer","miami",5);

        Server server1=new Server("ayse",1241,12.5,true);
        Server server2=new Server("ali",45214,12.5,false);
        Server server3=new Server("hilal",1254874,11,true);

        Server []servers={server2,server3};
        restaurant.hireServer(server1);
        restaurant.hireServers(servers);
        Chef chef1=new Chef("joe",487421,20,true);
        Chef chef2=new Chef("kyle",47789,20,true);
        Chef chef3=new Chef("derick",79512,25,false);
        restaurant.hireChef(chef1);
        Chef chefs[]={chef2,chef3};
        restaurant.hireChefs(chefs);
        System.out.println(Arrays.toString(servers));

        System.out.println(restaurant);

    }
}
/*
Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */