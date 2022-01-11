package day33_Static;

public class Phone {

    public String model;
    public int price;
    public String color;
    public double size;
    public static String brand="Apple",os="ios",madeI="China";

    public Phone(String model, int price, String color, double size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
   public void  faceTime(long phoneNumber){
       System.out.println("facTime with number: "+phoneNumber);
   }
   public void faceTime(String email){
       System.out.println("faceTime with email: "+email);
   }
   public void call(long phoneNumber){
       System.out.println("calling number: "+phoneNumber);
   }
   public void text(long phoneNumber){
       System.out.println("texting number: "+phoneNumber);
   }

    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", brand=" +brand +
                ", os=" + os +
                ", madeI=" + madeI +
                '}';
    }
}
/*

Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */