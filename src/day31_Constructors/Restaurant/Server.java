package day31_Constructors.Restaurant;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder() {
        System.out.println(name + " taking order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning table");
    }

    public String fullTim() {
        String result="";
        if (fullTime) {
            result="full time";
        } else {
            result="part time";
        }return result;
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTim() +
                '}';
    }
}
