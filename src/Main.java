import leadertypes.Leader;
import leadertypes.MilitaryDictator;
import leadertypes.PoliticalDictator;

import java.util.List;


void main() {
    List<Leader> leaders = LeaderManager.createLeaders();


    //test of adding additional leaders, invalid and valid
    LeaderManager.addLeader((new MilitaryDictator(null, null, -10, null)), leaders);
    LeaderManager.addLeader((new PoliticalDictator("Carsten", "Langbordistan", 23, "srr", "sir")), leaders);


    LeaderManager.performActions(leaders);
}
