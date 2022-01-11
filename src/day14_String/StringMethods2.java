package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String  str = "java is fun, i love learning java";
        String str2= str.replace("java", "python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("------------------------------------");

        String email1 ="johnsmith@yahoo.com";
        String email2= email1.replace("yahoo", "gmail");

        System.out.println("email1 = " + email1);
        System.out.println("email2 = " + email2);

        String sentence1 ="java java python python c# c# c++ c++ python python python";
        String sentence2= sentence1.replace("python", "").replace("  ",""); // like this u can delete python and u can replace again for delete extra spaces.

        System.out.println("sentence1 = " + sentence1);
        System.out.println("sentence2 = " + sentence2);

        System.out.println("------------------------------------");

        String s = "dog dog dog dog dog dog";
        s=s.replace("dog", "cat");

        System.out.println("s = " + s);

        System.out.println("----------------------------");

        String s2= "c# is fun, c# is cool";
        s2= s2.replace(" c#", " java");
        System.out.println("s2 = " + s2);

        System.out.println("----------------------------");

        String s3 = "java";
        s3= s3.replace("a", "e");
        System.out.println("s3 = " + s3);

        System.out.println("----------------------------");

        String s4 = "java";
        s4= s4.replace("a", "e");
        System.out.println("s4 = " + s4);

        System.out.println("----------------------------");

        String s5= "c# is fun, c# is cool";
        s5= s5.replaceFirst("c#", "java");
        System.out.println("s5 = " + s5);

        System.out.println("----------------------------");

        String s7 = "java";
        s7= s7.replaceFirst("va", "vo");
        System.out.println("s7 = " + s7);








    }
}
