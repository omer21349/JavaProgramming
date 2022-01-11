package day37Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia( int model, double size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense() {
        System.out.println(brand + " " + model + " self defensing");
    }

}
