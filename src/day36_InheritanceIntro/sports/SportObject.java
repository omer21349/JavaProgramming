package day36_InheritanceIntro.sports;

public class SportObject {
    public static void main(String[] args) {
        AmericanFootball americanFootball=new AmericanFootball();
        americanFootball.setInfo("joe",10,20,"run");

        System.out.println(americanFootball);

        americanFootball.play();



    }
}
