package day27_wrapperClasses;

public class WrapperClassesMethods {

    public static void main(String[] args) {

        String str="123";

        int num =Integer.parseInt(str);

        System.out.println(num);

        String str2= "10.5";

        double num2=Double.parseDouble(str2);

        System.out.println(num2);

        String str3="A";

       // char a= Character.parse

        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;



        System.out.println(max+"\n"+min);

        long max2= Long.MAX_VALUE;
        long min2= Long.MIN_VALUE;
        System.out.println(max2+"\n"+min2);

        String s1 ="true";

        boolean s2=Boolean.parseBoolean(s1);
        System.out.println(s2);


        System.out.println("-------------------------------------------------------------------------");

        String s5="123";

        Integer  s6=Integer.valueOf(s5);//here still s5 inbox just we did change from String to int
        int s7=Integer.valueOf(s5);// here we did int and unboxing
        System.out.println(s6);
        System.out.println(s7);


        System.out.println("-------------------------------------------------------------------------------");


        //isDigit()

        char ch1='0';

        boolean r2= Character.isDigit(ch1);

        System.out.println(r2);
        System.out.println("-----------------------------------------------------------------");
        char ch2='A';
        boolean r4= Character.isDigit(ch2);
        boolean r3= Character.isLetter(ch2);
        System.out.println(r4);
        System.out.println(r3);









    }
}
