package day33_Static;

public class Dog {

    public String breed, size;
    public char gender;
    int age;
    public String color;
    public static int numberOfLage=4, numberOfEyes=2,numberOfWings=0;
    public static boolean isFriendly=true;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void eating(){
        System.out.println(breed+"is eating");
    }
    public void play(){
        System.out.println(breed+" is playing");
    }
    public void sleep(){
        System.out.println(breed+" is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size=" + size +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", number Of Lage='" + numberOfLage + '\'' +
                ", number Of Eyes='" + numberOfEyes + '\'' +
                ", number Of Wings='" + numberOfWings + '\'' +
                ", is Friendly?='" + isFriendly + '\'' +
                '}';
    }
}
/*
1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */