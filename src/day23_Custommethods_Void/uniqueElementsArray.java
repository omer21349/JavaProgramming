package day23_Custommethods_Void;

public class uniqueElementsArray {
    public static void main(String[] args) {
      uniqueArray(new String[]{"ali","veli","hasan","hasan"});
    }
    public static void uniqueArray(String [] ar){

        for (String s : ar) {
            int count=0;
            for (String s1 : ar) {
                if (s.equalsIgnoreCase(s1)){
                    count++;
                }
            }if (count==1){
                System.out.println(s);
            }
        }

    }
}
