package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore= 20.5f;
        byte num1= (byte)averageScore;   // explicit costing
        short num2= (short)averageScore; // explicit costing
        int num3= (int)averageScore;     // explicit costing
        long num4= (long)averageScore;   // explicit costing
        float num5= averageScore;        // no costing
        double num6= averageScore;       // implicit casting

        System.out.println(averageScore +"\n" +num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6);


    }
}

/*
create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
 */
