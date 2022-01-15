package day39_Recap.animalTask;

public class FriendlyAnimal extends Animal{
    public static boolean isWild=false,isFriendly=true,isPlayable=true;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void play(){
        System.out.println(getName()+" is playing");
    }
    public void pet(){
        System.out.println(getName()+" pet to him");
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
Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
 */