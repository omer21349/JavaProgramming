package day31_Constructors.Restaurant;

public class Chef {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println(name+" is making an order");
    }
    public void washDishes(){
        System.out.println(name+" is washing the dishes");
    }
    public String full(){
        String result="";
        if(fullTime){
            result="full-time";
        }else {
            result="part-time";
        }return result;
    }


    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + full() +
                '}';
    }
}
/*
restaurantTask
6.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

	        Actions: (all void methods)

	            setInfo(): sets all of the instance variables with some values taken from the parameters.
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

		            Actions: (all void methods)

		                setInfo(): sets all of the instance variables with some values taken from the parameters.
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

		6.3 Create a class called Restaurant

	            Attributes:
	                Owner (String), Location (String), numberOfStars (int)
	                Servers (ArrayList of Server objects)
	                Chefs (ArrayList of Chef objects)

                Add a constructor that sets the owner, location, and number of stars.

	            Actions: (all void methods)

	                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
	                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

	                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
	                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

	                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
	                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

	                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information


		6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information


 */