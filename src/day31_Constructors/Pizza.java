package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int getNumberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int getNumberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.getNumberOfPepperoniTopping = getNumberOfPepperoniTopping;
    }
    public double calcCost(){
        double cost=0;
        double result=0;

        cost=(size=='S')?10:(size=='M')?12:14;
        result=cost+(2*(numberOfCheeseTopping+getNumberOfPepperoniTopping));
        return result;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", getNumberOfPepperoniTopping=" + getNumberOfPepperoniTopping +
                ", Total price= $" + calcCost() +
                '}';
    }
}


