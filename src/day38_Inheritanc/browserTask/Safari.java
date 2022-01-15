package day38_Inheritanc.browserTask;

public class Safari extends Browser {

    public Safari() {
        super("Browser");
    }

    public void openBrowser(){
        System.out.println("opening safari browser");
    }
    public void closeBrowser(){
        System.out.println("closing safari browser");
    }


}
/*
Safari extends Browser
					methods:
						openBrowser(): prints "opening safari browser"
						closeBrowser(): prints "closing safari browser"
 */
