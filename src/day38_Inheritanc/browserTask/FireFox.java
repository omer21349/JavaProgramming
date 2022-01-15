package day38_Inheritanc.browserTask;

public class FireFox extends Browser {
    public FireFox() {
        super("FireFox");
    }

    public void openBrowser(){
        System.out.println("opening firefox browser");
    }
    public void closeBrowser(){
        System.out.println("closing fire fox browser");
    }
}
/*
FireFox extends Browser
					methods:
						openBrowser(): prints "opening firefox browser"
						closeBrowser(): prints "closing fire fox browser"
 */