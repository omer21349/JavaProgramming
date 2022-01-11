package day36_InheritanceIntro.bookTask;

public class BookObject {
    public static void main(String[] args) {
        EBook eBook=new EBook();
        eBook.setInfo("alaca","komedy","ali",100,20,20);

        System.out.println(eBook);

        AudioBook audioBook=new AudioBook();
        audioBook.setInfo("life","beyazdis","jeo",20,30,"kyle");

        System.out.println(audioBook);
    }
}


/*
Book Task:
	3.1. create a class named Book:
			variables:
				title, type, author, price

			Methods:
				setInfo()
				toString()

	3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()

	3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

 */
