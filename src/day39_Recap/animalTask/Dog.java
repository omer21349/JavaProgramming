package day39_Recap.animalTask;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


}
/*
1. Dog:
					Extra methods:
						bark()
 */