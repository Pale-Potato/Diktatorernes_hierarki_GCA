package LeaderTypes;

import java.util.ArrayList;
import java.util.List;

//Superclass
public abstract class Leader {
    private String name;
    private String country;
    private int yearsInPower;

    public Leader(String name, String country, int yearsInPower) {
        setName(name);
        setCountry(country);
        setYearsInPower(yearsInPower);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Name required.");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null) {
            this.country = country;
        } else {
            System.out.println("Country required.");
        }
    }

    public int getYearsInPower() {
        return yearsInPower;
    }

    public void setYearsInPower(int yearsInPower) {
        if (yearsInPower >= 0) {
            this.yearsInPower = yearsInPower;
        } else {
            System.out.println("Invalid number.");
        }
    }

    public boolean isValid() {
        return name != null && country != null && yearsInPower >= 0;
    }


    public abstract void giveSpeech();

    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower);
    }

    public static List<Leader> createLeaders() {
        List<Leader> leaders = new ArrayList<>();
        leaders.add(new MilitaryDictator("Viktor Dravik", "Zorvania", 14, "Supreme General"));
        leaders.add(new MilitaryDictator("Marcus Veldor", "Kravonia", 22, "Field Marshal"));
        leaders.add(new PoliticalDictator("Alexander Voss", "Nordmark", 9, "Unity Party", "Supreme LeaderTypes.Leader"));
        leaders.add(new SocialMediaDictator("Maximus Click", "Digitopia", 11, "TruthNet"));

        leaders.removeIf(leader -> !leader.isValid()); //removes invalid objects

        return leaders;
    }

    public static void addLeader(Leader newLeader, List<Leader> leaders){
        if (newLeader.isValid()){
            leaders.add(newLeader);
        } else {
            System.out.println("Could not add new dictator to list.");
        }
    }

    public static void performActions(List<Leader> leaders) {
        for (Leader leader : leaders){
            System.out.println("=========================================================================================================");
            leader.printDetails();
            leader.giveSpeech();
            if (leader instanceof PowerActions powerActions){
                powerActions.implementPolicy();
                powerActions.repressOpposition();
                powerActions.holdParade();
            }

            if (leader instanceof SocialMediaDictator socialMediaDictator){
                socialMediaDictator.censorContent();
                socialMediaDictator.createFakeNews();
            }
            System.out.println("=========================================================================================================");
            System.out.println(" ");
        }
    }

}
