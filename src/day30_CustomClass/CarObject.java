package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static void main(String[] args) {

        Car carinfo= new Car();

        carinfo.setInfo("bmw","m3","white",2015,69.999);

        System.out.println(carinfo);

        Car carinfo2= new Car();
        carinfo2.setInfo("mercedes","c250","white",2012,20000);
        System.out.println(carinfo2);

        Car car3=new Car();
        car3.setInfo("toyota","corolla","tan",2008,4700);
        carinfo.start();
        carinfo.drive();
        carinfo.stop();

        //Car cars[]={carinfo,carinfo2,car3};//if i want to set in one place all car, i can use array but i can remove or add car in future that why ArrayList is better to use.

        ArrayList<Car>carList2=new ArrayList<>(Arrays.asList(carinfo,carinfo2,car3));

        for (Car each : carList2) {
            System.out.println(each.brand+": "+each.price);
        }
        //if there is a recall for bmw between 2005 and 2008, we need the remove from list, and for that we need to use removeIf method.
        carList2.removeIf(p-> p.brand.equals("bmw")&&p.year>=2005&&p.year<2008);
        System.out.println(carList2);






    }
}
