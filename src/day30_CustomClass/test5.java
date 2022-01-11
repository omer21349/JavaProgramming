package day30_CustomClass;

public class test5 {
    public static void main(String[] args) {

        String str = "aabbccddxhhlgpgdodwt";
        String result = "";


        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch=str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                char each=str.charAt(j);
                if(ch==each){
                    count++;
                }
                if(count==1){
                    System.out.println(ch);
                }}
        }}}
