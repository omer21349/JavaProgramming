package day37Inheritance.phoneTask;

public class IPhone extends Phone{
        public IPhone( int model, double size, double price, String color) {
        super("apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" facetime to "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" facetime to "+email);
    }

}
