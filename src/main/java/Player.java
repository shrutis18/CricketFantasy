public abstract class Player {
    private String name;
    private int catches;
    private int runsScored;

    public Player(String name){
        this.name = name;
        this.catches = 0;
        this.runsScored = 0;
    }

    public  String getName(){
        return this.name;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public int getCatches() {
        return catches;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public void setCatches(int catches) {
        this.catches = catches;
    }

    public abstract int calculatePoints();
}
