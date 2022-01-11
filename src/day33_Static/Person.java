package day33_Static;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman=true,haseNose=true,haseWings=false;
    public static int numberOfHead=1, numberOfEyes=2;
    public Person(String name){
        this.name=name;
    }
    public Person(String name,int age){
        this(name);
        this.age=age;
    }
    public Person(String name,int age,char gender){
        this(name,age);
        this.gender=gender;
    }

    public void eat(String food){
        System.out.println(name+" eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" drinking"+drink);
    }
    public void sleep(){
        System.out.println(name+"sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */