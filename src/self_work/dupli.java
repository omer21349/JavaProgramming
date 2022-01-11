package self_work;

public class dupli {
    public static void main(String[] args) {
        String a="aaabbvbccc";
         String result="";
        for (int i = 0; i < a.length(); i++) {
            if(!result.contains(a.charAt(i)+"")){
                result+=a.charAt(i);
                }
            }
        System.out.println(result);


    }
}
