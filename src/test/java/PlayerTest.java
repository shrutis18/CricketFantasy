import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void itShouldHaveAName() {
        String playerOneName = "Virat Kohli";
        Player playerOne = new Player(playerOneName);
        Assert.assertEquals(playerOneName, playerOne.getName());
    }

    @Test
    public void itShouldHaveZeroRunsWhenCreated() {
        String playerOneName = "Rahul dravid";
        Player playerOne = new Player(playerOneName);
        Assert.assertEquals(0,playerOne.getRunsScored());
    }

    @Test
    public void itShouldBeAbleToScoreRuns() {
        String playerOneName = "Yuvraj Singh";
        Player playerOne = new Player(playerOneName);
        playerOne.setRunsScored(40);
        Assert.assertEquals(40, playerOne.getRunsScored());
    }
}
