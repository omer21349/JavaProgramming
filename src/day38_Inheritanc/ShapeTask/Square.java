package day38_Inheritanc.ShapeTask;

public class Square extends Shape{

    public double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }
    public double area(){
        return side*side;
    }
    public double perimeter(){
        return side*4;
    }

    public String toString() {
        return super.toString()+
                "side=" + side ;
    }
}
