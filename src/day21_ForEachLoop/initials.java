package day21_ForEachLoop;

public class initials {
    public static void main(String[] args) {
        String clasemate[]={"Ali Gungor","Veysel Yaman","Hakan Tasiyan","Yildiz Tilbe","Muslum Gurses","Ibrahim Tatlises","Zerrin Ozer","Mhasun Kirmizi","Can yaman","Kivanc tatli"};

        for (String word:clasemate){
            String initila=word.charAt(0)+"."+word.charAt(word.indexOf(" ")+1);
            System.out.println(initila);
        }





    }
}
