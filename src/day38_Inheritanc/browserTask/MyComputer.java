package day38_Inheritanc.browserTask;

public class MyComputer {
    public static void main(String[] args) {

        FireFox fireFox=new FireFox();

        fireFox.closeBrowser();
        fireFox.openBrowser();

        Opera opera=new Opera();
        System.out.println(opera);



    }
}
