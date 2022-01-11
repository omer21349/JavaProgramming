package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int name =1;
        String b =(name>0&&name<=12)?(name==1)?"january":(name==2)?"fabruary":(name==3)? "Mars":(name==4)? "april":(name==5)? "may":(name==6)? "June":(name==7)? "July":(name==8)? "August":(name==9)? "September":(name==10)? "October":(name==11)? "November":"December" :"wrong number";
        System.out.println(b);
    }
}
