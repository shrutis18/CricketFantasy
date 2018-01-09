public class Batsman extends Player {
    public Batsman(String name) {
        super(name);
    }

    @Override
    public int calculatePoints() {
        int milestonePoints = this.getRunsScored() < 15? 0: ((this.getRunsScored()/15) - 1) * 15;
        int rulePoints = this.getRunsScored() * 2;
        int catchPoints = this.getCatches() * 10;
        return milestonePoints + rulePoints + catchPoints;
    }

}
