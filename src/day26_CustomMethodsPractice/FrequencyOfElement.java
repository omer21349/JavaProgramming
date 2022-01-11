package day26_CustomMethodsPractice;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int []arr={1,1,1,1,1,2,2,3,3,3,1,1,1};
        int a=FrequencyOfElement.frequencyOfElement(arr,1);
        System.out.println(a);
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
    
}
