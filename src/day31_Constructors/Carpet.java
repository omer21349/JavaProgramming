package day31_Constructors;

public class Carpet {

    public double width,length,unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double price=0;
        price=(width*length)*unitPrice;
        if(isPersian){
            price=price+200;
        }return price;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost of the carpet price" + calcCost() +
                '}';
    }
}
