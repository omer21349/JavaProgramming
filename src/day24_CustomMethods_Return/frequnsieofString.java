package day24_CustomMethods_Return;

public class frequnsieofString {
    public static void main(String[] args) {
        String n="aaagggddch";
        int a=frequncy(n,'g');
        System.out.println(a);// burada bize kac sayi oldugunu verir

        for (int i = 0; i < n.length(); i++) {//burada costem metodu kullanarak friquncy degerini kullanarak unick karecteri bulduk.
            a=frequncy(n,n.charAt(i));
            if(a==1){
                System.out.println(n.charAt(i));
            }
        }

    }
    public static int frequncy(String str,char ch){
         int count=0; String v="";
        for (char c : str.toCharArray()) {
           if(c==ch){
               count++;
            }
        }
        return count;
    }
}
