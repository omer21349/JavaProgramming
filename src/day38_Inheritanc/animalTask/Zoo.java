package day38_Inheritanc.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Tiger tiger=new Tiger("zoro","Sumatran",10,'M',"large","orange");

        System.out.println(tiger);

        tiger.eat();

        System.out.println(tiger.name);



    }


}
