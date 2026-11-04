import LeaderTypes.Leader;
import LeaderTypes.MilitaryDictator;
import LeaderTypes.PoliticalDictator;

import java.util.List;


void main() {
    List<Leader> leaders = Leader.createLeaders();


    //test of adding additional leaders, invalid and valid
    Leader.addLeader((new MilitaryDictator(null, null, -10, null)), leaders);
    Leader.addLeader((new PoliticalDictator("Carsten", "Langbordistan", 23, "srr", "sir")), leaders);


    Leader.performActions(leaders);
}
