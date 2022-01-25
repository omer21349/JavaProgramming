package day40_FinalKeyword;

import day38_Inheritanc.ShapeTask.Circle;

public class EncapsulationReview {

    private Circle circle;

    public Circle getCircle(){
        return circle;
    }
    public void setCircle(Circle circle){
       // if(circle.getRadius()<5)
        this.circle=circle;
    }




}
