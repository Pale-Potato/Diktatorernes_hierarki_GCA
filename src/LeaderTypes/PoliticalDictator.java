package LeaderTypes;

public class PoliticalDictator extends Leader implements PowerActions {
    private String partyName;
    private String partyTitle;

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName, String partyTitle) {
        super(name, country, yearsInPower);
        setPartyName(partyName);
        setPartyTitle(partyTitle);
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        if(partyName != null) {
            this.partyName = partyName;
        } else {
            System.out.println("Invalid party name.");
        }
    }

    public String getPartyTitle() {
        return partyTitle;
    }

    public void setPartyTitle(String partyTitle) {
        if (partyTitle != null) {
            this.partyTitle = partyTitle;
        } else {
            System.out.println("Invalid Title.");
        }
    }

    @Override
    public boolean isValid(){
        return super.isValid() && partyName != null && partyTitle != null;
    }

    public void giveSpeech() {
        System.out.println("Political Dictator: " + partyTitle + " " + getName() + " gives a speech promoting the party's agenda.");
    }

    public void implementPolicy(){
        System.out.println("Political Dictator: " + partyTitle + " " + getName() + " is implementing political policy: New Policy.");
    }

    public void repressOpposition(){
        System.out.println("Political Dictator: " + partyTitle + " " + getName() + " is repressing the opposition through political means.");
    }

    public void holdParade(){
        System.out.println("Political Dictator: " + partyTitle + " " + getName() + " is holding a political parade.");
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println(partyTitle + " of " + partyName);
    }
}
