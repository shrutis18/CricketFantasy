public class AllRounder extends Player{
    public AllRounder(String name) {
        super(name);
    }

    @Override
    public int calculatePoints() {
        int milestonePoints = this.getRunsScored() < 15? 0: ((this.getRunsScored()/15) - 1) * 15;
        int rulePoints = this.getRunsScored();
        int catchPoints = this.getCatches() * 12;
        return milestonePoints + rulePoints + catchPoints;
    }
}
