package utilities;

import java.util.Arrays;

public class ArrayUtilitiy {


    public static void printEachElement(int[] num){

        for (int i : num) {
            System.out.println(i+" ");
        }
    }
    public static void printEachElement(double[] num){

        for (double i : num) {
            System.out.println(i+" ");
        }
    }
    public static void printEachElement(char[] num){

        for (char i : num) {
            System.out.println(i+" ");
        }
    }
    public static void printEachElement(String[] num){

        for (String i : num) {
            System.out.println(i+" ");
        }
    }

    public static int max(int[]num){
        Arrays.sort(num);
        return num[num.length-1];
    }
    public static double max(double[]num){
        Arrays.sort(num);
        return num[num.length-1];
    }
    public static int min(int[]num){
        Arrays.sort(num);
        return num[0];
    }
    public static double min(double[]num){
        Arrays.sort(num);
        return num[0];
    }

    public static boolean contains(int arr[],int element){
        boolean result=false;
        for (int s : arr) {
            if (s==element){
                result=true;
            }
            }
        return result;
    }
    public static boolean contains(double arr[],double element){
        boolean result=false;
        for (double s : arr) {
            if (s==element){
                result=true;
            }
        }
        return result;
    }
    public static boolean contains(char arr[],char element){
        boolean result=false;
        for (char s : arr) {
            if (s==element){
                result=true;
            }
        }
        return result;
    }
    public static boolean contains(String arr[],String element){
        boolean result=false;
        for (String s : arr) {
            if (s.equals(element)){
                result=true;
            }
        }
        return result;
    }

    public static int []addArray(int arry[],int  element) {
        int b[] = new int[arry.length + 1];

        int i = 0;
        for (int each : arry) {
            b[i++] = each;
        }
        b[i] = element;
        return b;
    }
    public static double []addArray(double arry[],double  element){
        double b []= new double[arry.length+1];

        int i=0;
        for (double each : arry) {
            b[i++]=each;
        }
        b[i]=element;
        return b;

    }
    public static String[] addArray(String arry[],String element){

        String b []= new String[arry.length+1];

        int i=0;
        for (String each : arry) {
            b[i++]=each;
        }
        b[i]= element;
        return b;

    }
    public static char [] addArray(char ch[],char ch1){
        char b []= new char[ch.length+1];
        int i=0;
        for (char each : ch) {
            b[i++]=each;
        }
        b[i]= ch1;
        return b;
    }
    
    public static int  frequencyOfElement(int [] array,int elemant){
        int count=0;
        for (int each : array) {
            if(each==elemant){
                count++;
            }
        }return count;
    }
    public static int  frequencyOfElement(double [] array,double elemant){
        int count=0;
        for (double each : array) {
            if(each==elemant){
                count++;
            }
        }return count;
    }
    public static int  frequencyOfElement(char [] array,char elemant){
        int count=0;
        for (char each : array) {
            if(each==elemant){
                count++;
            }
        }return count;
    }
    public static int  frequencyOfElement(String [] array,String elemant){
        int count=0;
        for (String each : array) {
            if(each.equalsIgnoreCase(elemant)){
                count++;
            }
        }return count;
    }

    //returns the unique elements of the array as a new array
    public static int[]uniqueElement(int array[]) {
        int[] result = {};
        for (int i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static double[]uniqueElement(double array[]) {
        double[] result = {};
        for (double i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static char[]uniqueElement(char array[]) {
        char[] result = {};
        for (char i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }
    //returns the unique elements of the array as a new array
    public static String[]uniqueElement(String array[]) {
        String[] result = {};
        for (String i : array) {
            if (ArrayUtilitiy.frequencyOfElement(array,i)==1){
                result=ArrayUtilitiy.addArray(result,i);
            }
        }return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int arr1[],int arr2[]){

        int [] result= {};
        for (int each:arr1){
            result= ArrayUtilitiy.addArray(result,each);
        }for (int each:arr2){
            result= ArrayUtilitiy.addArray(result,each);
        }return result;

    }
    //merge the given two arrays and returns the new array
    public static double[] merge(double arr1[],double arr2[]){

        double [] result= {};
        for (double each:arr1){
            result= ArrayUtilitiy.addArray(result,each);
        }for (double each:arr2){
            result= ArrayUtilitiy.addArray(result,each);
        }return result;

    }
    //merge the given two arrays and returns the new array
    public static char[] merge(char arr1[],char arr2[]){

        char [] result= {};
        for (char each:arr1){
            result= ArrayUtilitiy.addArray(result,each);
        }for (char each:arr2){
            result= ArrayUtilitiy.addArray(result,each);
        }return result;

    }
    //merge the given two arrays and returns the new array
    public static String[] merge(String arr1[],String arr2[]){

        String [] result= {};
        for (String each:arr1){
            result= ArrayUtilitiy.addArray(result,each);
        }for (String each:arr2){
            result= ArrayUtilitiy.addArray(result,each);
        }return result;

    }

    public static int[] reversArray(int[]array){
        int[]result={};
        for (int i = array.length-1; i >=0 ; i--) {
            result= ArrayUtilitiy.addArray(result,array[i]);
        }
        return  result;
    }
    public static double[] reversArray(double[]array){
        double[]result={};
        for (int i = array.length-1; i >=0 ; i--) {
            result= ArrayUtilitiy.addArray(result,array[i]);
        }
        return  result;
    }
    public static char[] reversArray(char[]array){
        char[]result={};
        for (int i = array.length-1; i >=0 ; i--) {
            result= ArrayUtilitiy.addArray(result,array[i]);
        }
        return  result;
    }
    public static String[] reversArray(String[]array){
        String[]result={};
        for (int i = array.length-1; i >=0 ; i--) {
            result= ArrayUtilitiy.addArray(result,array[i]);
        }
        return  result;
    }

    public static int[] removeElement(int array[],int element){
        if(element<0||element> array.length-1){
            System.out.println("invalid index: " +element);
            System.exit(0);
        }
        int[]result= new int[(array.length)-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==element){
                continue;
            }result[j++]=array[i];
        }return result;
    }
    public static double[] removeElement(double array[],double element){
        if(element<0||element> array.length-1){
            System.out.println("invalid index: " +element);
            System.exit(0);
        }
        double[]result= new double[(array.length)-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==element){
                continue;
            }result[j++]=array[i];
        }return result;
    }
    public static char[] removeElement(char array[],char element){
        if(element<0||element> array.length-1){
            System.out.println("invalid index: " +element);
            System.exit(0);
        }
        char[]result= new char[(array.length)-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==element){
                continue;
            }result[j++]=array[i];
        }return result;
    }
    public static String[] removeElement(String array[],int element){
        if(element<0||element> array.length-1){
            System.out.println("invalid index: " +element);
            System.exit(0);
        }
        String[]result= new String[(array.length)-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==element){
                continue;
            }result[j++]=array[i];
        }return result;
    }

    public static int[] replace(int []array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
        
    }
    public static double[] replace(double []array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static char[] replace(char []array, int index, char newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static String[] replace(String []array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static int[] replaceAll(int []ar,int element,int newElement) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == element) {
                ar[i] = newElement;
            }
        }
        return ar;
    }
    public static double[] replaceAll(double []ar,double element,double newElement) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == element) {
                ar[i] = newElement;
            }
        }
        return ar;
    }
    public static char[] replaceAll(char []ar,char element,char newElement) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == element) {
                ar[i] = newElement;
            }
        }
        return ar;
    }
    public static String[] replaceAll(String []ar,String element,String newElement) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i].equals(element)) {
                ar[i] = newElement;
            }
        }
        return ar;
    }

    public static int[] removeDuplicates(int []array){

        int[] result={};
        for (int each : array) {
            if(!ArrayUtilitiy.contains(result,each)){
                result=ArrayUtilitiy.addArray(result,each);
            }
        }return result;
    }
    public static double[] removeDuplicates(double []array){

        double[] result={};
        for (double each : array) {
            if(!ArrayUtilitiy.contains(result,each)){
                result=ArrayUtilitiy.addArray(result,each);
            }
        }return result;
    }
    public static char[] removeDuplicates(char []array){

        char[] result={};
        for (char each : array) {
            if(!ArrayUtilitiy.contains(result,each)){
                result=ArrayUtilitiy.addArray(result,each);
            }
        }return result;
    }
    public static String[] removeDuplicates(String []array){

        String[] result={};
        for (String each : array) {
            if(!ArrayUtilitiy.contains(result,each)){
                result=ArrayUtilitiy.addArray(result,each);
            }
        }return result;
    }

}
