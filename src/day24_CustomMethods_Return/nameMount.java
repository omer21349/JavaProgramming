package day24_CustomMethods_Return;

public class nameMount {
    public static void main(String[] args) {
        String a= nameMount(5);
        System.out.println(a);

    }
    public static String nameMount(int num){

        String mount=(num>0&&num<=12)?(num==1)?"jan":(num==2)?"february":(num==3)?"march":(num==4)?"april":(num==5)?"may":
                (num==6)?"jun":(num==7)?"july":(num==8)?"agust":(num==9)?"september":(num==10)?"october":(num==11)?"november":"December":"Invalid number";

      return mount;
    }
}
