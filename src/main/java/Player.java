public class Player {

    private final String name;
    private int runsScored;
    private int catches;

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        this.runsScored = 0;
        this.catches = 0;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getCatches() {
        return catches;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }
}
