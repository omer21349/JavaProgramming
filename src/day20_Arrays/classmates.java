package day20_Arrays;

public class classmates {
    public static void main(String[] args) {
        String clasemate[]={"Ali Gungor","Veysel Yaman","Hakan Tasiyan","Yildiz Tilbe","Muslum Gurses","Ibrahim Tatlises","Zerrin Ozer","Mhasun Kirmizi","Can yaman","Kivanc tatli"};
        for (int i = 0; i < clasemate.length; i++) {
         int a = clasemate[i].indexOf(" ");
            System.out.println(clasemate[i].charAt(0)+"."+clasemate[i].charAt(a+1));

        }


    }
}

/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
