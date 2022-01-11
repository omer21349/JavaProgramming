package day27_wrapperClasses;

public class EqualUppercaseAndLowercase {
    public static void main(String[] args) {

        String str = "JAVA java";
        int count1=0,count2=0;
        for (char c : str.toCharArray()) {
             if(Character.isUpperCase(c)){
                 count1++;
             }if(Character.isLowerCase(c))
                count2++;
            }
        System.out.println(count1==count2);
        }

}
/*
Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */