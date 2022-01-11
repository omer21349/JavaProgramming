package day27_wrapperClasses;

public class RetrieveLettersDigits {
    public static void main(String[] args) {


        String str = "Wooden Spoon!";
        String letter="",digit="",spacial="";

        for (char c : str.toCharArray()) {
            if(Character.isLetter(c)){
                letter+=c;
            }else if(Character.isDigit(c)){
                digit+=c;
            }else {
                spacial+=c;
            }
        }
        System.out.println("letters= "+letter+"\n"+"Digits = "+digit+"\n"+"specialChars= "+spacial);


    }

}
/*
Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */
