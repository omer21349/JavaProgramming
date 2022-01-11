package day23_Custommethods_Void;

public class howManyDayMonth {
    public static void main(String[] args) {
     dayMonth("february");
    }
    public static void dayMonth(String day){
        int num=0;
        if (day.equalsIgnoreCase("february")){
            num=28;
        }else if(day.equalsIgnoreCase("april")||day.equalsIgnoreCase("june")||day.equalsIgnoreCase("sepdember")||day.equalsIgnoreCase("november")){
            num=30;
        }else {
            num=31;
        }
        System.out.println(num);


    }
}
