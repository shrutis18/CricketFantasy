import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TeamTest {

    @Test
    public void itShouldHaveAName(){ /////TODO make batsman of type player
        List<Player> players = new ArrayList<>();
        Batsman aBatsman = new Batsman("Yuvi");
        AllRounder anAllRounder = new AllRounder("Bumrah");
        players.add(aBatsman);
        players.add(anAllRounder);
        Team teamOne = new Team("teamOne",players, aBatsman);
        Assert.assertEquals("teamOne",teamOne.getTeamName());
    }

    @Test
    public void itShouldHaveAListOfPlayers() {
        List<Player> players = new ArrayList<>();
        Batsman aBatsman = new Batsman("Ab devillers");
        AllRounder anAllRounder = new AllRounder("Cris gayle");
        players.add(aBatsman);
        players.add(anAllRounder);
        Team teamOne = new Team("teamOne",players, aBatsman);
        Assert.assertEquals(2,teamOne.getPlayers().size());
    }
//
    @Test
    public void itShouldHaveZeroPointsInitially() {
        List<Player> players = new ArrayList<>();
        Batsman aBatsman = new Batsman("Ab devillers");
        AllRounder anAllRounder = new AllRounder("Cris gayle");
        players.add(aBatsman);
        players.add(anAllRounder);
        Team teamOne = new Team("teamOne",players, aBatsman);
        Assert.assertEquals(0,teamOne.getPoints());
    }

    @Test
    public void itShouldBeAbleToCalculateItsPoints() {
        List<Player> players = new ArrayList<>();
        Player aBatsman = new Batsman("Ab devillers");
        aBatsman.setRunsScored(35);
        aBatsman.setCatches(2);
        Player anAllRounder = new AllRounder("Cris gayle");
        anAllRounder.setRunsScored(35);
        anAllRounder.setCatches(2);
        players.add(aBatsman);
        players.add(anAllRounder);
        Team teamOne = new Team("teamOne",players, aBatsman);
        Assert.assertEquals(284,teamOne.getPoints());
    }

    @Test
    public void itShouldHaveAPowerPlayer() {
        //given
        List<Player> players = new ArrayList<>();
        Player aBatsman = new Batsman("Ab devillers");
        Player anAllRounder = new AllRounder("Cris gayle");
        players.add(aBatsman);
        players.add(anAllRounder);
        //when
        Team team = new Team ("team1", players, aBatsman);
        //then
        Assert.assertEquals(aBatsman,team.getPowerPlayer());

    }

}
