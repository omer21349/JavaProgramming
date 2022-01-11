package day10_NestedIf;

public class ChooseLanguage {
    public static void main(String[] args) {
        int a = 4;
        String b;

        if(a==1){
            b="Hello, thank for your call";
        }
        else if(a==2){
            b="Hola, gracias para llamar";
        }
        else if(a==3){
            b="Merhaba, aradiginiz icin tesekkurler";
        }
        else if(a==4){
            b="Privet, spasibo za vash zvonok";
        }
        else if(a==5){
            b="Merci ,pour votre appel";
        }
        else{
            b="wrong number";
        }
        System.out.println(b);
    }
}

/*
Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */
