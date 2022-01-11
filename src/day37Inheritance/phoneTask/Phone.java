package day37Inheritance.phoneTask;

public class Phone {
    public String brand;
    public int model;
    public double size, price;
    public String color;
    public static boolean hasBattery;

    public Phone(String brand, int model, double size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    static {
        hasBattery=true;
    }
    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" calling to "+phoneNumber);
    }
    public void tex(long phoneNumber){
        System.out.println(brand+" "+model+" texting to "+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
/*
Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the sub class' objects
 */