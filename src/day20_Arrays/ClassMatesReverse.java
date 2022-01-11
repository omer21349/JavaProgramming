package day20_Arrays;

public class ClassMatesReverse {
    public static void main(String[] args) {


    String clasemate[]={"Ali Gungor","Veysel Yaman","Hakan Tasiyan","Yildiz Tilbe","Muslum Gurses","Ibrahim Tatlises","Zerrin Ozer","Mhasun Kirmizi","Can yaman","Kivanc tatli"};

        for (int i = 0; i < clasemate.length; i++) {
            String result = "";
            for (int j =clasemate[i].length(); j> 0; j--) {
                result +=""+clasemate[i].charAt(j-1);//char da -1 sonuncuyu verir
            }System.out.println(result);
        }


    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */