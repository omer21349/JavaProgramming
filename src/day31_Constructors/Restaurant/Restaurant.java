package day31_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server>allServers= new ArrayList<>();
    public ArrayList<Chef>allChef=new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
         allServers.add(server);
    }
    public void hireServers(Server [] servers){
        allServers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        allChef.add(chef);
    }
    public void hireChefs(Chef [] chefs){
        allChef.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        allChef.removeIf(p->p.employeeID==employeeID);
    }
    public void erminateServer(int employeeID){
        allServers.removeIf(p->p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", allServers=" + allServers.size() +
                ", allChef=" + allChef.size() +
                '}';
    }
}
