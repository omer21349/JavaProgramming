package day39_Recap.statesTask;

public class States {

    private String name,abbreviation,politicalParty,governor,senator;
    private double population,stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            System.err.println("invalid name: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(name==null||name.isEmpty()){
            System.err.println("invalid name: "+name);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(name==null||name.isEmpty()){
            System.err.println("invalid name: "+name);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(name==null||name.isEmpty()){
            System.err.println("invalid name: "+name);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if(population<=0){
            System.err.println("invalid num: "+population);
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax<0){
            System.err.println("invalid number: "+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
1. Create a class named States:
			variables:
				name, abbreviation, politicalParty, Governor, senator, population, stateTax

			Encapsulate all the fields

			Add a constructor that can set all the fields

						Conditions:
							1. name, abbreviation, politicalParty, Governor, and senator can not be null
							2. name, abbreviation, politicalParty, Governor, and senator can not be empty
							3. taxRate can not be negative
							4. Population can not be set to zero or negative

			Methods:
				toString()


	2. Create the following sub classes of States and add any additional fields and methods if necessary:
				1. Virginia
				2. California
				3. Texas
				4. Florida


	3. Create a class named StateObjects
					Create the objects of each sub classes

					test all the functions of each objects

            		Analyze the relationships between the classes
 */