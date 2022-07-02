package selfPractice.MethodOverriding.StatesTask;

public class States {

    private String name, abbreviation, politicalParty, governor, senator;
    private double population;
           private double stateTaxRate;

    public States(String abbreviation, String politicalParty, String governor, String senator, double population, double stateTaxRate) {
        setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTaxRate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {

        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()){
            System.err.println("Invalid name: " + abbreviation);
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {

        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("Invalid name: " + politicalParty);
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {

        if (governor == null || governor.isEmpty() || governor.isBlank()){
            System.err.println("Invalid name: " + governor);
            System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if (senator == null || senator.isEmpty() || senator.isBlank()){
            System.err.println("Invalid name: " + senator);
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {

        if (population <= 0){
            System.err.println("Population can not be less or equal to zero");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTaxRate;
    }

    public void setStateTax(double stateTaxRate) {

        if (stateTaxRate < 0){
            System.err.println("State tax rate can not be negative: " + stateTaxRate);
            System.exit(1);
        }
        this.stateTaxRate = stateTaxRate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                " name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTaxRate=" + stateTaxRate +
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
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative

            Methods:
                toString()
 */