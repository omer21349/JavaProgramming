package day36_InheritanceIntro.bookTask;

public class EBook extends Book{
    public int size,pages;

    public void setInfo(String title, String type, String author, int price,int size, int pages) {
        this.setInfo(title,type,author,price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println(title+" reading");
    }

    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }
}
