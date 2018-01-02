import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TeamTest {

    @Test
    public void itShouldHaveAName(){
        List<Player> players = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        Player playerTwo = new Player("Cris gayle");
        players.add(playerOne);
        players.add(playerTwo);
        Team teamOne = new Team("teamOne",players);
        Assert.assertEquals("teamOne",teamOne.getTeamName());
    }

    @Test
    public void itShouldHaveAListOfPlayers() {
        List<Player> players = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        Player playerTwo = new Player("Cris gayle");
        players.add(playerOne);
        players.add(playerTwo);
        Team teamOne = new Team("teamOne",players);
        Assert.assertEquals(2,teamOne.getPlayers().size());
    }

    @Test
    public void itShouldHaveZeroPointsInitially() {
        List<Player> players = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        Player playerTwo = new Player("Cris gayle");
        players.add(playerOne);
        players.add(playerTwo);
        Team teamOne = new Team("teamOne",players);
        Assert.assertEquals(0,teamOne.getPoints());
    }

    @Test
    public void itShouldBeAbleToCalculatePointsBasedOnRunsScored() {
        List<Player> players = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        playerOne.setRunsScored(45);
        Player playerTwo = new Player("Cris gayle");
        playerTwo.setRunsScored(30);
        players.add(playerOne);
        players.add(playerTwo);
        Team teamOne = new Team("teamOne",players);
        Assert.assertEquals(90,teamOne.getPoints());
    }

    @Test
    public void itShouldBeAbleToCalculatePointsBasedOnCatches() {
        List<Player> players = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        playerOne.setCatches(2);
        Player playerTwo = new Player("Cris gayle");
        playerTwo.setCatches(3);
        players.add(playerOne);
        players.add(playerTwo);
        Team teamOne = new Team("teamOne",players);
        Assert.assertEquals(50,teamOne.getPoints());
    }
}
