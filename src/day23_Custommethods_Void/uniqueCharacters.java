package day23_Custommethods_Void;

public class uniqueCharacters {
    public static void main(String[] args) {
        uniqueCharacter("aaabbvvj");
    }
    public static void uniqueCharacter(String unique){


        for (int i = 0; i < unique.length(); i++) {
            int count =0;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(i)==unique.charAt(j)){
                    count++;
            }
                }if (count==1){
                System.out.println(unique.charAt(i));
        }


        }
    }
}
