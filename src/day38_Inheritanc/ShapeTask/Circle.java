package day38_Inheritanc.ShapeTask;

public class Circle extends Shape{

    public static double pi;
    public double radius;

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }
    static {
        pi=3.14;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    public String toString() {
        return super.toString()+
                "radius=" + radius;
    }
}
