package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalsAction {

    public static void main(String[] args) {

        Animals animal1 = new Animals();
        animal1.setInfo("lion","brown","desert","large",12,"hunting");

        Animals animal2=new Animals();
        animal2.setInfo("cat", "white and brown","street","small",12,"run fast");

        System.out.println(animal2);
        animal1.come();
        animal2.jump();


        Animals ar[]={animal1,animal2};
        System.out.println(Arrays.toString(ar));

        ArrayList<Animals>animalsList=new ArrayList<>();
        animalsList.addAll(Arrays.asList(ar));
        System.out.println(animalsList);







    }

}
