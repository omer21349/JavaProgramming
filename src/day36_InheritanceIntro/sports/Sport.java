package day36_InheritanceIntro.sports;

public class Sport {
    public String name;
    public int numberOfPlayers,numberOfRefere;
    public String rules;

    public void setInfo(String name, int numberOfPlayers, int numberOfRefere, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfRefere = numberOfRefere;
        this.rules = rules;
    }
    public void play(){
        System.out.println(name+" is playing");
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfRefere=" + numberOfRefere +
                ", rules='" + rules + '\'' +
                '}';
    }
}
