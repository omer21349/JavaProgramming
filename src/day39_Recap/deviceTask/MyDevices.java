package day39_Recap.deviceTask;

public class MyDevices {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("13 proMax",1100);

        System.out.println(iphone);

        Laptop laptop=new Laptop("hp","omen gaming",1200);
        System.out.println(laptop);

        Samsung samsung=new Samsung("A70",400);
        System.out.println(samsung);

        Desktop desktop=new Desktop("casper","23",400);
        System.out.println(desktop);


    }
}
