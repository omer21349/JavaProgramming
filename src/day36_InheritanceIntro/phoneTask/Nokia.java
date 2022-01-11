package day36_InheritanceIntro.phoneTask;

public class Nokia extends Phone{

    public void selfDefense(){
        System.out.println(brand+" "+model+" self defensing");
    }



}
/*
Create a sub class of Phone named Nokia:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					selfDefense()
					toString()

		1.5 Create a class named Phone Objects and test of the sub class' objects
 */