package day35_OOP_Encapsulation.restaurantTask;

public class Chef {
    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.err.println("invalid ID: "+employeeID);
        }
        this.employeeID = employeeID;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate<0){
            System.err.println("invalid salary rate: "+hourlyRate);
            return;
        }
        this.hourlyRate = hourlyRate;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
    public void makeOrder(){
        System.out.println(name+" is making Order");
    }
    public void washDishes(){
        System.out.println(name+" is washing dishes");
    }
    public String fullTimeOrPart(){
        String result="";
        if(fullTime==true){
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
                ", fullTime=" + fullTimeOrPart() +
                '}';
    }
}
/*
6.2 Create a class called Chef

		            Attributes:
		                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

		            Actions: (all void methods)

		                setInfo(): sets all of the instance variables with some values taken from the parameters.
		                makeOrder(): chef's name + "is making an order"
		                washDishes(): chef's name + "is washing the dishes"
		                toString(): Returns (String) all the information of a Chef
		                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */