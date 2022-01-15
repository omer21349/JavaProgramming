package day39_Recap.animalTask;

public class WildAnimal extends Animal {
    public static boolean isWild=true, isFriendly=false, isPlayable=false;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void hunt(){
        System.out.println(getName()+" is hunting");
    }

    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", isWild='" + isWild + '\'' +
                ", isFriendly='" + isFriendly + '\'' +
                ", isPlayable='" + isPlayable + '\'' +
                '}';
    }

}
/*
Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()
 */