package day36_InheritanceIntro.phoneTask;

public class IPhone extends Phone {
    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" facetime to "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" facetime to "+email);
    }
}
/*
2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()
 */