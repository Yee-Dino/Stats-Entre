public class Event extends SwimmingPlayer {
    /**
     * not gonna lie idk what this does
     */

    private double lastTenAverage;
    private double improvementPercent;
    private boolean PB;
     
    public Event(String n, double avg, double improvement, boolean PB) {
        super(n);
        lastTenAverage = avg;
        improvementPercent = improvement;
        this.PB = PB;
    }
}
