package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GrateCoulculator {
    public static void main(String[] args) {
        ArrayList<Integer>score=new ArrayList<>();
        score.addAll(Arrays.asList(110,100,90,75,85,65,85,55,45,73,73,35,47));

        ArrayList<Integer>gradeA=new ArrayList<>(score);
        gradeA.removeIf(p -> p<90||p>100);
        ArrayList<Integer>gradeB=new ArrayList<>(score);
        gradeB.removeIf(p -> p<80||p>89);
        ArrayList<Integer>gradeC=new ArrayList<>(score);
        gradeC.removeIf(p -> p<70||p>79);
        ArrayList<Integer>gradeD=new ArrayList<>(score);
        gradeD.removeIf(p -> p<60||p>69);
        ArrayList<Integer>gradeF=new ArrayList<>(score);
        gradeF.removeIf(p -> p>59);
        System.out.println("gradeA: "+gradeA.size());
        System.out.println("gradeB: "+gradeB.size());
        System.out.println("gradeC: "+gradeC.size());
        System.out.println("gradeD: "+gradeD.size());
        System.out.println("gradeF: "+gradeF.size());



    }
}
