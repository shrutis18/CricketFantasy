import java.util.List;

public class Team {
    private final String teamName;
    private int points;

    public List<Player> getPlayers() {
        return players;
    }

    private final List<Player> players;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
        this.points = 0;
    }

    public int getPoints() {
        return calculatePoints();
    }

    private int calculatePoints() {
       return players.stream().filter(player -> player.getRunsScored()>0).mapToInt(player -> (player.getRunsScored() / 15 - 1) * 5 + player.getRunsScored()).sum();
    }


    public String getTeamName() {
        return teamName;
    }
}
