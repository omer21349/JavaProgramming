package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
    public static void main(String[] args) {



        ArrayList<Pizza>pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza=new Pizza('S',2,3);
            Pizza mediumPizza=new Pizza('M',4,2);
            Pizza largePizza=new Pizza('L',5,4);
            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println("total pizza= "+pizzas.size());
        double cost=0;
        for (Pizza each : pizzas) {
            cost+=each.calcCost();
        }
        System.out.println("total price= "+cost);


    }
}

/*
Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */
