package self_work;

import java.util.Arrays;

public class RemoveDuplucate {
    public static void main(String[] args) {

        int a[]={1,1,1,1,2,2,2,3,3,3,4,4,};
        a=removeDuplucate(a);
        System.out.println(Arrays.toString(a));

    }
    public static int [] removeDuplucate(int arr[]) {
        int arr2[] = {};
        int j=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr2[j]!=arr[i]){
                arr2[j++]+=arr[i];
        }

        }

          return arr2 ;
    }

}
