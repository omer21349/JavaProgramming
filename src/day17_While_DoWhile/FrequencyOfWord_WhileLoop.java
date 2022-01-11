package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str ="Java Java JavaPython";


        int num =0;
        while (str.contains("Java")){
           str= str.replaceFirst("Java","");
            num++;

        }System.out.println(num);
        System.out.println("------------------------------------------------------");

        String a="cat cat cat cat do do dog cat";
          a=a.toLowerCase();
        int num2=0;
        while (a.contains("cat")){
            a=a.replaceFirst("cat","");
            num2++;
        }
        System.out.println(num2);


        System.out.println("-------------------------------------------------");

        String name5="java java java java phyton phyton phyton phyton";
         name5=name5.toLowerCase();
        int java = 0 , phyton=0;

        while (name5.contains("java")||name5.contains("phyton")){
            if (name5.contains("java")){
                name5=name5.replaceFirst("java","");
                java++;
            }if(name5.contains("phyton")){
                name5=name5.replaceFirst("phyton","");
                phyton++;
            }


        }
        System.out.println("java = " + java);
        System.out.println("phyton = " + phyton);















    }
}
