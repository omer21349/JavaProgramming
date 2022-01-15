package day39_Recap.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, int price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }

    public void call(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is calling this number: "+phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is texting this number: "+phoneNum);
    }


}
/*
Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)
 */