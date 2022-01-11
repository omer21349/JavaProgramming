package day10_NestedIf;

public class GradeRaport2 {
    public static void main(String[] args) {
        int grade= 1010;
        String a =(grade>0&&grade<=100)?(grade>=90)? "Excellent":(grade>=80)? "Great":(grade>=70)? "Good":(grade>=60)? "passed":"faild" :"wrong grade";
        System.out.println(a);
    }
}
