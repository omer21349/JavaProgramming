package day35_OOP_Encapsulation;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("large")|| size.equalsIgnoreCase("medium"))){
            System.err.println("invalid size: "+size);
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (size.equalsIgnoreCase("small")&&numberOfCheeseTopping<0 || numberOfCheeseTopping > 3) {
                System.err.println("invalid cheese topping number for small size: " + numberOfCheeseTopping);
                return;
        } if (size.equalsIgnoreCase("medium")&&numberOfCheeseTopping<0 || numberOfCheeseTopping > 4) {
                System.err.println("invalid cheese topping number for medium size: " + numberOfCheeseTopping);
                return;
        }if(size.equalsIgnoreCase("large") &&numberOfCheeseTopping<0|| numberOfCheeseTopping > 5) {
                System.err.println("invalid cheese topping number for large size: " + numberOfCheeseTopping);
                return;
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if(size.equalsIgnoreCase("small")&&numberOfCheeseTopping<0||numberOfPepperoniTopping>4){
            System.err.println("invalid pepperoni topping for small size: "+numberOfPepperoniTopping);
            return;
        }
        if(size.equalsIgnoreCase("medium")&&numberOfCheeseTopping<0||numberOfPepperoniTopping>5){
            System.err.println("invalid pepperoni topping for medium size: "+numberOfPepperoniTopping);
            return;
        }
        if(size.equalsIgnoreCase("large")&&numberOfCheeseTopping<0||numberOfPepperoniTopping>6){
            System.err.println("invalid pepperoni topping for small large: "+numberOfPepperoniTopping);
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calcCost() +
                '}';
    }
    public int calcCost(){
        int result=0;
        if(size.equalsIgnoreCase("small")){
            result=10+2*(numberOfPepperoniTopping+numberOfCheeseTopping);
        }if(size.equalsIgnoreCase("medium")){
            result =12+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }if(size.equalsIgnoreCase("large")){
            result =14+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        return result;
    }


}
/*
Create class named :
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */
