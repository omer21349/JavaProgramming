package day24_CustomMethods_Return;

public class test {
    public static void main(String[] args) {

     String word="level", result ="",a="";

        for (int i = word.length()-1; i >=0 ; i--) {
            result +=word.charAt(i)+"";
        }if (result.equals(word)){
            a=word+ " is palindrome";
        }else {
            a=word+ " is not palindrome";
        }
        System.out.println(a);


    }
}