package day35_OOP_Encapsulation;

public class Item {
    private String name;
    private int unitPrice, quantity;

    public Item(String name, int unitPrice, int quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        char a[]=name.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            if(!(Character.isLetter(a[i])||Character.isDigit(a[i])||a[i]==' ')||!Character.isLetter(a[0])){
                System.err.println("invalid name: "+name);
                return;
            }
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("invalid name");
            return;
        }
        this.name=name;
    }
    public int getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(int unitPrice){
        if (unitPrice<0){
            System.err.println("invalid price");
            return;
        }
        this.unitPrice=unitPrice;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity<0|| (name.equalsIgnoreCase("toilet paper")&&quantity>1)){
            System.err.println("invalid quantity");
            return;
        }
        this.quantity=quantity;
    }
    public int calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total Cost=" + calcCost() +
                '}';
    }
}
/*
create a class called Item
	            private variables:
	            	name, unitPrice, quantity

            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */