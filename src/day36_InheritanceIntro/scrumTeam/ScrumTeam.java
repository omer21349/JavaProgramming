package day36_InheritanceIntro.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;

    ArrayList<Tester>testersList=new ArrayList<>();
    ArrayList<Developer>developersList=new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void removeTester(int id){
        testersList.removeIf(p->p.id==id);
    }
    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(int id){
        developersList.removeIf(p->p.id==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testersList.size() +
                ", number of developers=" + developersList.size() +
                '}';
    }
}
