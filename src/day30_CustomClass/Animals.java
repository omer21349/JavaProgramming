package day30_CustomClass;

public class Animals {

    public String type;
    public String color;
    public String whereLive;
    public String size;
    public int age;
    public String future;

    public void setInfo(String type, String color, String whereLive, String size, int age, String future) {
        this.type = type;
        this.color = color;
        this.whereLive = whereLive;
        this.size = size;
        this.age = age;
        this.future = future;
    }


    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", whereLive='" + whereLive + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", future='" + future + '\'' +
                '}';
    }
    public void come(){
        System.out.println(type+" is coming");
    }
    public void jump(){
        System.out.println(type+" is jumping");
    }




}
