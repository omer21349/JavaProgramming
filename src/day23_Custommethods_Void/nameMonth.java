package day23_Custommethods_Void;

public class nameMonth {
    public static void main(String[] args) {
        nameMount(5);
    }
    public static void nameMount(int num){

       String mount=(num>0&&num<=12)?(num==1)?"jan":(num==2)?"february":(num==3)?"march":(num==4)?"april":(num==5)?"may":
                (num==6)?"jun":(num==7)?"july":(num==8)?"agust":(num==9)?"september":(num==10)?"october":(num==11)?"november":"December":"Invalid number";
        System.out.println(mount);

    }
}
