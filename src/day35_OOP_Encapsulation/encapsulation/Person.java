package day35_OOP_Encapsulation.encapsulation;

public class Person {
    private String name;
    private  int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        if(age<=0||age>120){
            System.err.println("invalid age: "+age);
            System.exit(0);
        }
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
