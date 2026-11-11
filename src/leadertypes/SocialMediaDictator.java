package leadertypes;

public class SocialMediaDictator extends Leader implements PowerActions {
    private String username;

    public SocialMediaDictator(String name, String country, int yearsInPower, String username) {
        super(name, country, yearsInPower);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null || username.isBlank()) {
            throw new IllegalArgumentException("Username required");
        }
        this.username = username;
    }

    @Override
    public boolean isValid(){
        return super.isValid() && username != null;
    }

    public void giveSpeech() {
        System.out.println("Social Media Dictator: " + getName() + " @" + username + " starts podcast.");
    }

    public void implementPolicy(){
        System.out.println("Social Media Dictator: " + getName() + " @" + username + " is posting about new policies online.");
    }

    public void repressOpposition(){
        System.out.println("Social Media Dictator: " + getName() + " @" + username + " is doxing the haters.");
    }

    public void holdParade(){
        System.out.println("Social Media Dictator: " + getName() + " @" + username + " is livestreaming.");
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("@" + username + " on social media.");

    }

    //bonus methods
    public void censorContent(){
        System.out.println("Social Media Dictator: " + getName() + " @" + username + " censors the hate-comments.");
    }

    public void createFakeNews(){
        System.out.println("Social Media Dictator: " + getName() + " @" + username + " is spreading the ''real'' truth.");
    }

}
