package day35_OOP_Encapsulation;

public class Dog {

    public String breed;
    public int size,age;
    public String color;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, int size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    static {
        numberOfLegs=4;
        numberOfEyes=2;
        numberOfWings=0;
        isFriendly=true;
    }
    public void eat(){
        System.out.println(breed+ " eating");
    }
    public void drink(){
        System.out.println(breed+" drinking");
    }
    public void sleep(){
        System.out.println(breed+" sleeping");
    }
    public void play(){
        System.out.println(breed+" playing");
    }
    public void bark(){
        System.out.println(breed+" barking");
    }
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size=" + size +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
  /*  Create a class called Dog
        Variables:
        breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

        Add a constructor to initialized all the fields

        Add a static block to initialize all the statics

        Methods:
        eat()
        drink()
        sleep()
        play()
        bark()
        toString()
*/