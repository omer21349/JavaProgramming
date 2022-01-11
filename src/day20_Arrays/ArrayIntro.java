package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
         String[] myGroup=new String [5];

         myGroup[0]="omer";
        myGroup[1]="hasan";
        myGroup[2]="kerim";
        myGroup[3]="ali";
        myGroup[3]="ayse";

        System.out.println(Arrays.toString(myGroup));


        System.out.println("-----------------------------------");

        String [] day= new String[7];

        day[0]="monday";
        day[1]="tuesday";
        day[2]="wetnesday";
        day[3]="thorsday";
        day[4]="friday";
        day[5]="saturday";
        day[6]="sunday";


        System.out.println(Arrays.toString(day));

        System.out.println("---------------------------------------------------------");

        String days[]={"moda","tuesday","wetnesday","thorsday","friday","saturday","sunday"};

        System.out.println(Arrays.toString(days));

        System.out.println("--------------------------------------------------------------------------");

        String days1[]={"moda","tuesday","wetnesday","thorsday","friday","saturday","sunday"};

        int num=5;
        if(num<1||num>7){
            System.exit(0);
        }

        System.out.println(days[num-1]);







    }
}
