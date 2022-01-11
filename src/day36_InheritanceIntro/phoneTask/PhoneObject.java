package day36_InheritanceIntro.phoneTask;

public class PhoneObject {
    public static void main(String[] args) {

        Nokia nokia=new Nokia();
        nokia.setInfo("nokia",3310,4.7,300,"blue");

        System.out.println(nokia);

        nokia.selfDefense();




    }

}


/*
Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

		1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()

		1.4 Create a sub class of Phone named Nokia:
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
