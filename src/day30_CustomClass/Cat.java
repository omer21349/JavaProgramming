package day30_CustomClass;

public class Cat {

    public String name;
    public String gender;
    public int age;
    public String size;
    public String color;
    public String breed;



    public void catInfo(String catName, String catGender, int catAge, String catSize, String catColor, String catBreed){

        name=catName;
        age=catAge;
        gender=catGender;
        size=catSize;
        color=catColor;
        breed=catBreed;

    }

    public void eatFood(){
        System.out.println(name+" eating");
    }
    public void come(){
        System.out.println(name+" coming");
    }


    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
