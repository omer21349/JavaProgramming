package day33_Static;

public class Circle {

    public double radius, diameter;
    public static double pi=3.14;

    public Circle(double radius){
        this.radius=radius;
        this.diameter=radius*2;
    }
   // public Circle(double radius){
   //     this(radius);

    //}
    public void calcArea(){
        System.out.println("area of circle is= "+radius*radius*pi);
    }
    public void calcPerimeter(){
        System.out.println("perimeter of circle is= "+diameter*pi);
    }
    public void printPi(){
        System.out.println("pi is: "+pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
/*
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement


 */