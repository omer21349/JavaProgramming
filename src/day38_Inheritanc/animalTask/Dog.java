package day38_Inheritanc.animalTask;

public class Dog extends Animal{
    public Dog(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void eat(){
        System.out.println(name+" is eating");
    }


}
/*
 Dog
					eat(): eats dog food
 */