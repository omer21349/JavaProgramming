package self_work;

public class uniq {
    public static void main(String[] args) {
        String a="aaabbvbccc";
          String b="";
        for (int i = 0; i < a.length(); i++) {
            if(a.indexOf(a.charAt(i))==a.lastIndexOf(a.charAt(i))){
                b+=a.charAt(i);
            }
        }
        //System.out.println(b);

        System.out.println("-------------------------------------------------------");

        String b1="aaabbvbccc";

        for (int i = 0; i < b1.length(); i++) {
            int count=0;
            for (int j = 0; j < b1.length(); j++) {
                if(b1.charAt(i)==b1.charAt(j)){
                    count++;
                }
            }if(count==1){
                System.out.println(b1.charAt(i));
            }

        }



    }
}
