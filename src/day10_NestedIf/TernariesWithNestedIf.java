package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s =85;
        String b=(s>=0 && s<=100)?(s>=60)?"passed": "failed":"invalid";
        System.out.println(b);
    }
}
