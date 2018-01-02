public class Player {

    private final String name;
    private int runsScored;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        this.runsScored = 0;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
