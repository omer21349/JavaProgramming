package day34_GarbageCollection_AcsessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static {//static block always run fist and only run 1 times

        System.out.println("static block");

    }

}
