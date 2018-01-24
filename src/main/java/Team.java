import java.util.List;

public class Team {
    private final String teamName;
    private int points;

    private final List<Player> players;
    private Player powerPlayer;

    public List<Player> getPlayers() {
        return players;
    }

    public Team(String teamName, List<Player> players, Player powerPlayer) {
        this.teamName = teamName;
        this.players = players;
        this.points = 0;
        this.powerPlayer = powerPlayer;
    }

    public int getPoints() {
        return calculatePoints();
    }

    private int calculatePoints() {

        return players.stream().filter(player -> player.getName() != powerPlayer.getName()).mapToInt(player -> player.calculatePoints()).sum()
                + powerPlayer.calculatePoints() * 2;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player getPowerPlayer() {
        return powerPlayer;
    }
}
