package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1= new Dog();
        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="white";
        System.out.println(dog1);

        Dog dog2=new Dog();
        dog2.name="ACE";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";
        System.out.println(dog2);

        Dog dog3= new Dog();
        dog3.setInfo("Comar","Kangal",7,'M',"Large","White");

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4=new Dog();
        dog4.setInfo("Karabas","Kangal",10,'F',"Large","Yellow");
        Dog dog5=new Dog();
dog5.setInfo("Sully","Pitbull",6,'M',"Large","Black");

        Dog doglist[]={dog1,dog2,dog3,dog4,dog5};
        System.out.println(Arrays.toString(doglist));
        ArrayList<Dog>femaleDog=new ArrayList<>();
        ArrayList<Dog>maleDog=new ArrayList<>(Arrays.asList(doglist));

        for (Dog each : doglist) {
           if(each.gender=='F'){
          femaleDog.add(each);
            }
        }
        System.out.println(femaleDog);

        maleDog.removeIf(p->p.gender=='F');
        System.out.println(maleDog);


    }

}
