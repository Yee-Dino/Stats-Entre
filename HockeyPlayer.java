class HockeyPlayer extends Player {
    /**
     * A Player class to store player stats for the StatMaster application.
     */

    // all public so that coaches can access them and change them as necessary
    public int goals;
    public int assists;
    public int penalties;
    public int shots;
    public int gamesPlayed;

    public HockeyPlayer(String n) {
        super(n);
        goals = 0;
        assists = 0;
        penalties = 0;
        shots = 0;
        gamesPlayed = 0;
    }

    public HockeyPlayer(String n, int g, int a, int p, int s, int games) {
        super(n);
        goals = g;
        assists = a;
        penalties = p;
        shots = s;
        gamesPlayed = games;
    }
}
