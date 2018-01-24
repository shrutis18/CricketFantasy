import java.util.List;

public class Team {
    private final String teamName;
    private int points;

    private final List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
        this.points = 0;
    }

    public int getPoints() {
        return calculatePoints();
    }

    private int calculatePoints() {
       return players.stream().mapToInt(player -> player.calculatePoints()).sum();
    }

    public String getTeamName() {
        return teamName;
    }
}
