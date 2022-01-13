package day38_Inheritanc.car;

public class Toyota extends Car {

    public Toyota( String model, int year, double price, String color, int mile) {
        super("Toyota", model, year, price, color, mile);
    }
    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mile=" + mile +
                '}';
    }
}
