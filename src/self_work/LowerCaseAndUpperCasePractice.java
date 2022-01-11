package self_work;

import java.util.ArrayList;
import java.util.Arrays;



public class LowerCaseAndUpperCasePractice {
    public static void main(String[] args) {

        String str = "omerGuven nedenSen Senden omer          ";

        str=str.toLowerCase();
        System.out.println(str);

        str=str.toUpperCase();
        System.out.println(str);

        int lastS=str.lastIndexOf("S");
        int firstS=str.indexOf("S");

        System.out.println(lastS);
        System.out.println(firstS);
        str=str.trim();
        System.out.println(str);

        str=str.replace("OMER","Alev ");
        System.out.println(str);

        str=str.replaceFirst("NEDEN","Ebru ");
        System.out.println(str);

        str= str.replace(" Alev"," Omer");
        System.out.println(str);

        //String str2="Alev GUVEN Ebru SEN SENDEN Omer";

        str=str.substring(0,str.indexOf(" "))+str.substring(str.lastIndexOf(" O"))+str.substring(str.indexOf("G"),str.indexOf(" E"));

        System.out.println(str);

        String kalp[]=str.split(" ");

        ArrayList<String>addHard=new ArrayList<>(Arrays.asList(kalp));
        addHard.add(1,"<3");
        System.out.println(addHard);

        kalp=addHard.toArray(new String[0]);
        System.out.println(Arrays.toString(kalp));

        String result="";
        for (String s :kalp) {
            result+=s+" ";
        }
        System.out.println(result);


        ArrayList<String>list= new ArrayList<>(Arrays.asList("ali","veli","cmal","hasan"));

        String[]a=list.toArray(new String[0]);


        System.out.println(Arrays.toString(a));


        System.out.println("-------------------------------------------------------");


        String str5="neden gelmedin";

        boolean b =str5.startsWith("n");//or "ne"  or "neden"
        System.out.println(b);

        boolean c=str5.endsWith("n");//or u can say endsWith("gelmedin").
        System.out.println(c);

        boolean g=str5.contains("neden");
        System.out.println(g);

        boolean s5=str5.equals("neden gelmedin");
        System.out.println(s5);

        boolean s6=str5.equalsIgnoreCase("NEDEN GELMEDIN");
        System.out.println(s6);

        String j=str5.replace("n","t");
        System.out.println(j);

        String g8=j.replaceFirst("e","a");
        System.out.println(g8);




    }


}
