package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName="chrome";
        String result= "";
        boolean validBrowser= browserName == "chrome" || browserName== "fireFox" ||browserName=="opera"
                                  || browserName=="safari" ||browserName== "edge" ;

        if (validBrowser){
            if(browserName == "chrome"){
                result ="Crome Browser is Selected";
            }
            else if (browserName=="fireFox"){
                result= "Fire Browser is Selected";
            }else if(browserName=="opera"){
                result="Opera Browser is selected";
            }
            else if (browserName=="safari"){
                result="Safari browser is selected";
            }
            else{
                result="edge browser is selected";
            }
            System.out.println(result);


        }


    }
}


/*
1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */