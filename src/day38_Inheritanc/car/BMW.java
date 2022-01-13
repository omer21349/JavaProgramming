package day38_Inheritanc.car;

public class BMW extends Car {
    public BMW( String model, int year, double price, String color, int mile) {
        super("BMW", model, year, price, color, mile);
    }
    public void breaking(){
        System.out.println(brand+" "+model+" is breaking");
    }
    public void racing(){
        System.out.println(brand+" "+model+" is racing");
    }

    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", mile=" + mile +
                '}';
    }
}
