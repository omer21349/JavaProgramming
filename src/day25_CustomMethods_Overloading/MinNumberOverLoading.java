package day25_CustomMethods_Overloading;

public class MinNumberOverLoading {
    public static void main(String[] args) {

        int ar[]={10,5,7,9,40,6};

        System.out.println(maxnuber(ar));
        
    }

    public static int maxnuber(int [] arr){


        int min=arr[0];
        for (int i : arr) {
            if (i<min){
                min=i;
            }
        }return min;
    }
    public static double maxnuber(double [] arr){


        double min=arr[0];
        for (double i : arr) {
            if (i<min){
                min=i;
            }
        }return min;
    }
    public static long maxnuber(long [] arr){


        long min=arr[0];
        for (long i : arr) {
            if (i<min){
                min=i;
            }
        }return min;
    }
    public static short minnuber(short [] arr){


        short min=arr[0];
        for (short i : arr) {
            if (i<min){
                min=i;
            }
        }return min;
    }
    public static float minnuber(float [] arr){


        float min=arr[0];
        for (float i : arr) {
            if (i<min){
                min=i;
            }
        }return min;
    }
    public static byte minnuber(byte [] arr){


        byte min=arr[0];
        for (byte i : arr) {
            if (i<min){
                min=i;
            }
        }return min;
    }
}
