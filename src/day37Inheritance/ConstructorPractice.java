package day37Inheritance;


class A{

    public int a;
    public A(int a){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        super(32);
        System.out.println("B");

    }
}


public class ConstructorPractice {

    public static void main(String[] args) {
        B b=new B();



    }


    public static void main(){
        System.out.println();
    }

}
