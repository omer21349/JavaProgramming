package day35_OOP_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings,numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }
    static {
        planet="world";
        isHuman=true;
        hasNose=true;
        numberOfWings=2;
        numberOfHead=1;
    }
    public void  printPlanetName(){
        System.out.println("planet name is "+planet);
    }
    public void  eat(String food){
        System.out.println(name+" eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" drinking "+drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet name ='" + planet + '\'' +
                ", isHuman='" + isHuman + '\'' +
                ", hasNose='" + hasNose + '\'' +
                '}';
    }
}
/*
Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()
 */