import leadertypes.*;

import java.util.ArrayList;
import java.util.List;

public class LeaderManager {
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


