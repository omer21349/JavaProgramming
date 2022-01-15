package day39_Recap.deviceTask;

public class TV extends Device{
    public TV(String brand, String model, int price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }

    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" is chanel up");
    }
    public void channelDown(){
        System.out.println(getBrand()+" "+getModel()+" is chanel down");
    }
}
/*
Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()
 */