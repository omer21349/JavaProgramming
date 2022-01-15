package day39_Recap.deviceTask;

public class Computer extends Device{
    public Computer(String brand, String model, int price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }
    public void game(){
        System.out.println(getBrand()+" "+getModel()+" is running game");
    }
}
/*
Create a subclass of Device named Computer:

				Add the extra methods if needed
 */