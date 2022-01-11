package day33_Static;

public class Car {
    public String make,model,color;
    public int year;
    public double price;
    public static int numberOfWheels=4;
    public static boolean hasBattery=true, hasSeats=true;

    public Car(String make){
        this.make=make;
    }
    public Car(String make,String model){
        this(make);
        this.model=model;
    }
    public Car(String make,String model,String color){
        this(make,model);
        this.color=color;
    }
    public Car(String make,String model,String color,int year,double price){
        this(make,model,color);
        this.year=year;
        this.price=price;
    }
    public void drive(){
        System.out.println(make+" "+model+" driving");
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", numberOfWheels=" + numberOfWheels +
                ", hasBattery=" + hasBattery +
                ", hasSeats=" + hasSeats +
                '}';
    }
}
/*

1. Create a class called Car
            Attributes:
                 instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats

            Add a constructor to initialize all the fields

           Methods:
                drive()
                toString()

 */
