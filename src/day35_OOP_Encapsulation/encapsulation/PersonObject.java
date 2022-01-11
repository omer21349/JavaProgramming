package day35_OOP_Encapsulation.encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setAge(10);
        person1.setName("omer");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());



    }

}
