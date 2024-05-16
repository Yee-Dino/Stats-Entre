import java.util.ArrayList;

public class Team {
    /**
     * A Team class for coaches to store teams.
     */


    public ArrayList<Player> team;
    
    
    public Team() {
        team = new ArrayList<Player>();
    }

    public Team(ArrayList<Player> t) {
        team = t;
    }

}
