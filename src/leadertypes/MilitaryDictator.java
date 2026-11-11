package leadertypes;

public class MilitaryDictator extends Leader implements PowerActions {

    private String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        setMilitaryRank(militaryRank);
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        if (militaryRank != null || militaryRank.isBlank()) {
            throw new IllegalArgumentException("Rank required");
        }
        this.militaryRank = militaryRank;
        }


    @Override
    public boolean isValid(){
        return super.isValid() && militaryRank != null;
    }


    public void giveSpeech() {
        System.out.println("Military Dictator: " + militaryRank + " " + getName() + " gives a speech emphasizing military strength.");
    }

    public void implementPolicy(){
        System.out.println("Military Dictator: " + militaryRank + " " + getName() + " is implementing military policy: New Policy.");
    }

    public void repressOpposition(){
        System.out.println("Military Dictator: " + militaryRank + " " + getName() + " is repressing the opposition with force.");
    }

    public void holdParade(){
        System.out.println("Military Dictator: " + militaryRank + " " + getName() + " is holding a military parade.");
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Military rank: " + militaryRank);
    }


}
