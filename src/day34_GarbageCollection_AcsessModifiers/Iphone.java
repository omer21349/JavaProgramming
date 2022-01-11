package day34_GarbageCollection_AcsessModifiers;

public class Iphone {
    public static String brand;
    public String model;
    public int size;
    public String color;
    public int price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn,designedIn;

    public Iphone(String brand, String model, int size, String color, int price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    static {
        brand="Apple";
        madeIn="China";
        designedIn="USA";
        OS="iphone";
        isSmartPhone=true;
    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }
    public static void call(long phoneNumber){
        System.out.println(phoneNumber+" calling");
    }
    public static void text(long phoneNumber){
        System.out.println("texting to"+phoneNumber);
    }
    public static void faceTime(long phoneNumber){
        System.out.println("face time with "+phoneNumber);
    }
    public static void faceTime(String email){
        System.out.println("face time with "+email);
    }
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */
