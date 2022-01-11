package day16_FoorLoop_StringPractice;

public class DogAndCat {
    public static void main(String[] args) {
        String word="caT dog dogG cAt";

        int howManyDog = 0,
               howManyCat=0;


        for (int i = 0; i <= word.length()-3; i++) {
            if(word.substring(i,i+3).equalsIgnoreCase("dog")){
                howManyDog++;
            }if(word.substring(i,i+3).equalsIgnoreCase("cat")){
                howManyCat++;
            }


        }boolean c= howManyCat==howManyDog;
        System.out.println(c);


    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true

 */
