package day39_Recap.animalTask;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

}