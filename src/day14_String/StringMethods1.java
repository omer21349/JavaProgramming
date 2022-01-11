package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1= "       batch 25      ";
        str1=str1.trim();

        System.out.println(str1);

        System.out.println("_-------------------------------------");

        String str2 = "Cydeo School";

        int n1 =str2.indexOf("h");
        System.out.println("n1= "+ n1);

        int n2 =str2.indexOf("ool");
        System.out.println("n2= "+ n2);

        String str3 = "java programing language";

        int n3 =str3.indexOf("an");

        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g");
        System.out.println(n4);

        int n5= str3.lastIndexOf("g");
        System.out.println(n5);


        System.out.println("==========================================");

        String str4 = "java nova cava wawa orange";

        int seventA= str4.lastIndexOf("a o");
        System.out.println(seventA);

        int fourt= str4.indexOf("ca")+1;
        System.out.println(fourt);






    }



}
