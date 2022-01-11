package day23_Custommethods_Void;

public class nameDay {
    public static void main(String[] args) {
        nameOfTheDay(1);
    }
    public static void nameOfTheDay(int day){

    String result="";

        switch (day){
            case 1:
                result="monday";
                break;
            case 2:
                result="tuesday";
                break;
            case 3:
                result="wednesday";
                break;
            case 4:
                result="thursday";
                break;
            case 5:
                result="friday";
                break;
            case 6:
                result="saturday";
                break;
            case 7:
                result="sunday";
                break;
            default:
                result="invalid number";

        } System.out.println(result);




    }

}
