package day37Inheritance.phoneTask;

public class Samsung extends Phone {

    public Samsung( int model, double size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze() {
        System.out.println(brand + "" + model + " freezing");

    }

}
