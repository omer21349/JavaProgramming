package day25_CustomMethods_Overloading;

public class MaxNumberOverleading {
    public static void main(String[] args) {
        int ar[]={10,5,7,9,40,6};

        System.out.println(maxnuber(ar));

    }
    public static int maxnuber(int [] arr){


        int max=arr[0];
        for (int i : arr) {
            if (i>max){
                max=i;
            }
        }return max;
    }
    public static double maxnuber(double [] arr){


        double max=arr[0];
        for (double i : arr) {
            if (i>max){
                max=i;
            }
        }return max;
    }
    public static long maxnuber(long [] arr){


        long max=arr[0];
        for (long i : arr) {
            if (i>max){
                max=i;
            }
        }return max;
    }
    public static short maxnuber(short [] arr){


        short max=arr[0];
        for (short i : arr) {
            if (i>max){
                max=i;
            }
        }return max;
    }
    public static float maxnuber(float [] arr){


        float max=arr[0];
        for (float i : arr) {
            if (i>max){
                max=i;
            }
        }return max;
    }
    public static byte maxnuber(byte [] arr){


        byte max=arr[0];
        for (byte i : arr) {
            if (i>max){
                max=i;
            }
        }return max;
    }
}


