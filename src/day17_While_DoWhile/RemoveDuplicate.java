package day17_While_DoWhile;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String a="AAABBBCC";
        String result="";

        for (int i = 0; i < a.length(); i++) {
           char b= a.charAt(i);
            if (!(result.contains(b+""))){
                result+=b;
            }
        }System.out.println(result);





    }
}
