package day38_Inheritanc.browserTask;

public class Opera extends Browser{
    public Opera() {
        super("Opera");
    }

    public void openBrowser(){
        System.out.println("opening opera browser");
    }
    public void closeBrowser(){
        System.out.println("closing opera browser");
    }


}
/*
3. Opera extends Browser
					methods:
						openBrowser(): prints "opening opera browser"
						closeBrowser(): prints "closing opera browser"
 */