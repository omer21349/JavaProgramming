package day36_InheritanceIntro.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("lucy","husky",'m',2,"small","white");

        dog.eat();
        dog.drink();


        Cat cat=new Cat();
        cat.setInfo("tarcin","british",'m',3,"small","brown");

        cat.meow();
        cat.drink();
        cat.sleep();

        Tiger tiger=new Tiger();
        tiger.setInfo("sher khan","bengal",'f',20,"large","orange");

        tiger.move();
        tiger.hunt();
        System.out.println(tiger+"\n"+cat+"\n"+dog);

    }
}
