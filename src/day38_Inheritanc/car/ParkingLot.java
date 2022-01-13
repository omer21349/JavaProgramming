package day38_Inheritanc.car;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota= new Toyota("Camry",2020,20000,"Gray",2397623);

        Tesla tesla= new Tesla("Model S", 2022,94990,"Red",120200);

        BMW bmw=new BMW("X5", 2020, 67350, "black", 12000);

        System.out.println(tesla);

        tesla.start();
        toyota.start();
        bmw.start();








    }


}
