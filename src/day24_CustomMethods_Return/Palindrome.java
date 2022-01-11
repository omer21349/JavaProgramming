package day24_CustomMethods_Return;

public class Palindrome {
    public static void main(String[] args) {

        String g="Level";
        System.out.println(isPalindrome(g));
    }
    public static boolean isPalindrome(String str){
        boolean result;
        String reverst="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverst+=str.charAt(i);
        }if(reverst.equalsIgnoreCase(str)){
            result=true;
        }else {
            result=false;
        }

        return result;
    }
}
/*
By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
