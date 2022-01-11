package day31_Constructors;

public class BankAcountObjeck {
    public static void main(String[] args) {

        BankAccount acount1=new BankAccount();
        acount1.setBank("Ahmet Ozkok",123456789);
        System.out.println(acount1);

        acount1.deposit(1000);
        acount1.checkbalance();
        acount1.withdraw(900);

        acount1.checkbalance();


        BankAccount account2=new BankAccount();
        account2.setBank("alev erol",145632587);

        account2.deposit(11000);
        account2.checkbalance();


    }
}
