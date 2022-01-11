package day24_CustomMethods_Return;

public class DuplicatedCaracter {
    public static void main(String[] args) {
        String sentece="aabbnfdkckkkllll";
        System.out.println(duplicateCaracter(sentece));
    }
    public static String duplicateCaracter(String word){
             String result="";
        for (char c : word.toCharArray()) {
            if(!result.contains(c+"")){
                result+=c;

            }
        }
        return result;
    }
}
