package day38_Inheritanc.car;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int mile) {
        super("Tesla", model, year, price, color, mile);
    }
    public void autoPilot(){
        System.out.println(brand+" on auto pilot");
    }

    public void start() {
        System.out.println("Say \"start\" to start "+brand+ " "+model);
    }
}
/*
Tesla:
                extra methods:
                    autoPilot();
 */