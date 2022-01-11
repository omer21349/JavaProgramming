package day35_OOP_Encapsulation;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount bankAccount1=new BankAccount("omer",6346,500);
        bankAccount1.deposit(10);

        System.out.println(bankAccount1);
        bankAccount1.withdraw(300);
        System.out.println(bankAccount1.checkbalance());
        System.out.println(bankAccount1);


    }
}
