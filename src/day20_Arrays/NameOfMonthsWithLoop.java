package day20_Arrays;

public class NameOfMonthsWithLoop {
    public static void main(String[] args) {



        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

        for (int i = 0; i <months.length ; i++) {
            System.out.print(months[i]+" ");
        }

        System.out.println("-----------------------------------------------------------------------");


        String months2[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

        for (int j = months.length-1; j >=0 ; j--) {
            System.out.print(months2[j]+" ");
        }





    }
}
