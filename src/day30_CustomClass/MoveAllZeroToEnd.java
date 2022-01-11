package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        ArrayList<Integer>moveZero=new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int num=moveZero.size();
        moveZero.removeAll(Arrays.asList(0));
        int num2= moveZero.size();
        int num3= num-num2;
        for (int i = 0; i < num3; i++) {
            moveZero.add(0);
        }
        System.out.println(moveZero);

    }
}
/*
Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]
 */
