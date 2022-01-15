package day38_Inheritanc.animalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void eat(){
        System.out.println(name+" eats cat food");
    }
}
/*
Cat
					eat(): eats cat food
 */