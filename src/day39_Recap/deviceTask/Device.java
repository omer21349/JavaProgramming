package day39_Recap.deviceTask;

public class Device {
    private String brand,model;
    private int price;
    private boolean hasBattery;
    public static boolean hasPowerButton=true;

    public Device(String brand, String model, int price, boolean hasBattery) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void turnOn(){
        System.out.println(brand+" "+model+" is turning on");
    }
    public void turnOff(){
        System.out.println(brand+" "+model+" is turning off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
/*
Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()


	2. Create a subclass of Device named Phone:

				Extra Methods:
						call(long phoneNum), text(long phoneNum)

	3. Create a subclass of Device named Computer:

				Add the extra methods if needed

	4. Create a sub class of Device named TV:

				Extra Methods:
					channelUp()
					channelDown()

	5. Create the following sub classes of Phone and add any extra methods that are needed:

				1. Iphone
				2. Samsung
				3. BlackBerry
				4. Google
				5. Nokia


	5. Create the following sub classes of Computer and add any extra methods that are needed:
				1. PersonalComputer
				1. Desktop
				2. Laptop


	6. Create a class named MyDevices:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */