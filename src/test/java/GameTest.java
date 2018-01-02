import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    @Test
    public void itShouldBeAbleToAddTeams(){
        Game game = new Game();

        List<Player> playersTeamOne = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        playerOne.setRunsScored(30);
        Player playerTwo = new Player("Cris gayle");
        playerTwo.setRunsScored(30);
        playersTeamOne.add(playerOne);
        playersTeamOne.add(playerTwo);
        Team teamOne = new Team("teamOne",playersTeamOne);

        List<Player> playersTeamTwo = new ArrayList<>();
        Player playerThree = new Player("Sachin Tendulkar");
        playerThree.setRunsScored(20);
        Player playerFour = new Player("Rohit Sharma");
        playerFour.setRunsScored(20);
        playersTeamTwo.add(playerThree);
        playersTeamTwo.add(playerFour);
        Team teamTwo = new Team("teamTwo",playersTeamTwo);

        game.addTeam(teamOne);
        game.addTeam(teamTwo);

        Assert.assertEquals(2, game.getTeams().size());
    }

    @Test
    public void itShouldReturnTheWinnerTeam() {
        Game game = new Game();

        List<Player> playersTeamOne = new ArrayList<>();
        Player playerOne = new Player("Ab devillers");
        playerOne.setRunsScored(30);
        Player playerTwo = new Player("Cris gayle");
        playerTwo.setRunsScored(30);
        playersTeamOne.add(playerOne);
        playersTeamOne.add(playerTwo);
        Team teamOne = new Team("teamOne",playersTeamOne);

        List<Player> playersTeamTwo = new ArrayList<>();
        Player playerThree = new Player("Sachin Tendulkar");
        playerThree.setRunsScored(20);
        Player playerFour = new Player("Rohit Sharma");
        playerFour.setRunsScored(20);
        playersTeamTwo.add(playerThree);
        playersTeamTwo.add(playerFour);
        Team teamTwo = new Team("teamTwo",playersTeamTwo);

        game.addTeam(teamOne);
        game.addTeam(teamTwo);

        Assert.assertEquals("teamOne",game.decideWinner());



    }
}
