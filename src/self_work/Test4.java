package self_work;

public class Test4 {

    private String name;
    private int year;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>2010){
            System.err.println("invalid number "+year);
            System.exit(0);
        }
            this.year=year;
    }

    public String toString() {
        return "Test4{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}