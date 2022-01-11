package day32_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed,int dogAge, char dogGender, String dogSize,String dogColor){
        name =dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }



    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }




    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}


class DogObjects{

    public static void main(String[] args) {

        day30_CustomClass.Dog dog1 = new day30_CustomClass.Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "white";
        System.out.println(dog1);

        day30_CustomClass.Dog dog2 = new day30_CustomClass.Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";
        System.out.println(dog2);

        day30_CustomClass.Dog dog3 = new day30_CustomClass.Dog();
        dog3.setInfo("Comar", "Kangal", 7, 'M', "Large", "White");

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        day30_CustomClass.Dog dog4 = new day30_CustomClass.Dog();
        dog4.setInfo("Karabas", "Kangal", 10, 'F', "Large", "Yellow");
        day30_CustomClass.Dog dog5 = new day30_CustomClass.Dog();
        dog5.setInfo("Sully", "Pitbull", 6, 'M', "Large", "Black");

        day30_CustomClass.Dog doglist[] = {dog1, dog2, dog3, dog4, dog5};
        System.out.println(Arrays.toString(doglist));
        ArrayList<day30_CustomClass.Dog> femaleDog = new ArrayList<>();
        ArrayList<day30_CustomClass.Dog> maleDog = new ArrayList<>(Arrays.asList(doglist));

        for (day30_CustomClass.Dog each : doglist) {
            if (each.gender == 'F') {
                femaleDog.add(each);
            }
        }
        System.out.println(femaleDog);

        maleDog.removeIf(p -> p.gender == 'F');
        System.out.println(maleDog);
    }
}