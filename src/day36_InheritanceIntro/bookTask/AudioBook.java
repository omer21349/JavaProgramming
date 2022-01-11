package day36_InheritanceIntro.bookTask;

public class AudioBook extends Book {
    public int length;
    public String narrator;

    public void setInfo(String title, String type, String author, int price,int length, String narrator) {
        this.setInfo(title,type,author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println(title+" listening");
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()

 */