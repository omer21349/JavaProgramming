package day12_Scanner;

public class Browser {
    public static void main(String[] args) {
        String name= "chrome",
                a;

        switch (name){
            case "chrome":
                a="Chrome";
                break;
            case "firefox":
                a="firefox";
                break;
            case "opera":
                a="opera";
                break;
            case "safari":
                a="safari";
                break;
            default:
                a="edge";
                break;
        }
        System.out.println(a);


    }
}

/*
write a program that can display the selected browser
            3.1  declear a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */
