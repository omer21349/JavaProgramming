package day39_Recap.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog("comar","sivas",'M',6,"large","white");
        System.out.println(dog);

        Lion lion=new Lion("king","african",'M',3,"large","yellow");
        System.out.println(lion);

        dog.setName("karabas");

        System.out.println(dog);
        System.out.println(lion.getAge());



    }
}
