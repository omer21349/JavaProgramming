package day21_ForEachLoop;

public class ReverseName {
    public static void main(String[] args) {

        String clasemate[]={"Ali Gungor","Veysel Yaman","Hakan Tasiyan","Yildiz Tilbe","Muslum Gurses","Ibrahim Tatlises","Zerrin Ozer","Mhasun Kirmizi","Can yaman","Kivanc tatli"};

        for (String a: clasemate) {

            String reverse="";
            for (int i = a.length()-1; i >=0 ;i--) {
                reverse+= a.charAt(i);
            }System.out.println(reverse);
        }


    }
}
