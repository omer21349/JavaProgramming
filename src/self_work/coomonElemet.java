package self_work;

public class coomonElemet {

    public static void main(String[] args) {
       int arr1[]= {1,2,3,4,5};
       int arr2[]= {4,5,6,7,8};

        for (int each : arr1) {
          int count=0;
            for (int each2 : arr2) {
                if(each==each2){
                    System.out.print(each+" ");
                }
            }
        }






    }
}
