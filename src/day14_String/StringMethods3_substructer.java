package day14_String;

public class StringMethods3_substructer {
    public static void main(String[] args) {

        String word = "Cydeo School";
        word= word.substring(0, 7);

        System.out.println("word = " + word);

        System.out.println("----------------------------------------");


        String brand = "Cydeo School";
        brand= brand.substring(0, 4+1);

        System.out.println("word = " + brand);

        System.out.println("----------------------------------------");

        String b = "Cydeo School";
        b= b.substring(6);

        System.out.println("word = " + b);

        System.out.println("----------------------------------------");

        String word2 = "Java programing language";

        String s1= word2.substring(0, word2.indexOf(" ")); //"java"
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3= word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);





    }
}
