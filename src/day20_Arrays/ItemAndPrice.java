package day20_Arrays;

import java.util.Scanner;

public class ItemAndPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item[]=new String[5];
        int price[]= new int[5];
        int totalprice=0;
         int price2=0;
         String name="";
        for (int i = 0,j=0; i < item.length&&j<price.length;j++, i++) {
            System.out.println("please enter a item");
             item[i]=input.nextLine();
            System.out.println("please enter a price");
            price[j]=input.nextInt();
            input.nextLine();
            totalprice+=price[j];
            price2=price[j];
            name+=item[i]+" ";
        }
        System.out.println(totalprice+"\n"+name+"\n"+price2);
       input.close();


    }
}
