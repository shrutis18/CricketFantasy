import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    @Test
    public void itShouldBeAbleToAddTeams(){
        Game game = new Game();

        List<Player> playersTeamOne = new ArrayList<>();
        Player aBatsman = new Batsman("Ab devillers");
        aBatsman.setRunsScored(30);
        Player anAllRounder = new AllRounder("Cris gayle");
        anAllRounder.setRunsScored(30);
        playersTeamOne.add(aBatsman);
        playersTeamOne.add(anAllRounder);
        Team teamOne = new Team("teamOne",playersTeamOne);

        List<Player> playersTeamTwo = new ArrayList<>();
        Player anotherBatsman = new Batsman("Sachin Tendulkar");
        anotherBatsman.setRunsScored(20);
        Player anotherAllRounder = new AllRounder("Rohit Sharma");
        anotherAllRounder.setRunsScored(20);
        playersTeamTwo.add(anotherBatsman);
        playersTeamTwo.add(anotherAllRounder);
        Team teamTwo = new Team("teamTwo",playersTeamTwo);

        game.addTeam(teamOne);
        game.addTeam(teamTwo);

        Assert.assertEquals(2, game.getTeams().size());
    }

    @Test
    public void itShouldReturnTheWinnerTeam() {
        Game game = new Game();

        List<Player> playersTeamOne = new ArrayList<>();
        Player aBatsman = new Batsman("Ab devillers");
        aBatsman.setRunsScored(30);
        Player anAllRounder = new AllRounder("Cris gayle");
        anAllRounder.setRunsScored(30);
        anAllRounder.setCatches(1);
        playersTeamOne.add(aBatsman);
        playersTeamOne.add(anAllRounder);
        Team teamOne = new Team("teamOne",playersTeamOne);

        List<Player> playersTeamTwo = new ArrayList<>();
        Player anotherBatsman = new Batsman("Sachin Tendulkar");
        anotherBatsman.setRunsScored(20);
        Player anotherAllRounder = new AllRounder("Rohit Sharma");
        anotherAllRounder.setRunsScored(20);
        playersTeamTwo.add(anotherBatsman);
        playersTeamTwo.add(anotherAllRounder);
        Team teamTwo = new Team("teamTwo",playersTeamTwo);

        game.addTeam(teamOne);
        game.addTeam(teamTwo);

        Assert.assertEquals("teamOne",game.decideWinner());

    }
}
