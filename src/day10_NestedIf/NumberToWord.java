package day10_NestedIf;

public class NumberToWord {
    public static void main(String[] args) {
        int number= 1;
        String a;


        if (number==1){
            a="one";
        }
        else if (number==2){
            a="two";
        }
        else if (number==3){
            a="three";
        }
        else if (number==4){
            a="four";
        }
        else if (number==5){
            a="five";
        }
        else if (number==6){
            a="six";
        }
        else if (number==7){
            a="seven";
        }
        else if (number==8){
            a="eight";
        }
        else if (number==9){
            a="nine";
        }
        else{
            a="error";
        }
        System.out.println(a);

    }
}


/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */