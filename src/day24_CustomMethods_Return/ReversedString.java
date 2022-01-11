package day24_CustomMethods_Return;

public class ReversedString {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(reversedString(str));
    }
    public static String reversedString(String str){
String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
/*
create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ

 */