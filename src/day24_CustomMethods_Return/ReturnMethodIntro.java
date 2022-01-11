package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        String str = "java";
        String result = revers12(str);
        System.out.println(result);

    }

    public static String revers12(String str) {
        String reversa = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversa += str.charAt(i);

        }

        return reversa;
    }
}