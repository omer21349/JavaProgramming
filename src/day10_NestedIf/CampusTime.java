package day10_NestedIf;

public class CampusTime {
    public static void main(String[] args) {
        int num=1;
        String a;

        if(num>=1&&num<=24){
            if(num>=8&&num<=23){
                a="Open";
            }
            else {
                a="Close";
            }
        }
        else {
            a="Wrong hours";
        }
        System.out.println(a);
    }
}
