package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int [][] arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};

        for (int i = arr2d.length-1; i>=0; i--) {
            for (int j = arr2d[i].length - 1; j >= 0; j--) {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
            }
        System.out.println("---------------------------------------------");


        for (int i = 0; i < arr2d.length; i++) {
            for (int i1 = arr2d[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2d[i][i1]+" ");
            }
            System.out.println();
        }






    }
}

