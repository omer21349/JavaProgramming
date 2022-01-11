package day20_Arrays;

public class ShoppingItem {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {
            if (items[i].contains("Gloves")){
                System.out.println(items[i].indexOf("G"));
            }
        }
        for (int i = 0; i < items.length; i++) {
          if (items[i].contains("iPad")){
              System.out.println("true");
          }
        }
        for (int i = 0,j=0,d=0; i < items.length&&j<prices.length&&d<itemIDs.length;d++,j++, i++) {
            System.out.println("name: "+items[i]+" price: "+prices[j]+" #ID "+itemIDs[d]);
        }

    }
}
/*

Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
 */
