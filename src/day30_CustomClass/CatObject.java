package day30_CustomClass;

public class CatObject {
    public static void main(String[] args) {

        Cat cat=new Cat();

        cat.catInfo("mico","male",4,"large","white","street");

        System.out.println(cat);


        cat.eatFood();
        cat.come();
    }
}
