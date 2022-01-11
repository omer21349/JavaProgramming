package day34_GarbageCollection_AcsessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers=new ArrayList<>();
    //numbers.add(10); //here its take more than 1 steps that why is give me c-error, that why i need to use static block.

    public Circle(double radius){
        this.radius=radius;
        pi=3.14;//don't use in here because static need to call only one time but if you put here its gonna call always when i need the call instants.
    }

    static {
        pi=3.14;
        name="Circle";
        numbers.add(10);
        numbers.add(20);
    }




}
