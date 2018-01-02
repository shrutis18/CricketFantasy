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
        return calculatePointsBasedOnRuns() + calculatePointsBasedOnCatches();
    }

    private int calculatePointsBasedOnRuns() {
        return players.stream().filter(player -> player.getRunsScored()>0).mapToInt(player -> (player.getRunsScored() / 15 - 1) * 5 + player.getRunsScored()).sum();
    }

    private int calculatePointsBasedOnCatches() {
        return players.stream().filter(player -> player.getCatches()>0).mapToInt(player -> player.getCatches() * 10).sum();
    }


    public String getTeamName() {
        return teamName;
    }
}
