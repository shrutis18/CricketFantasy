import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Game {

    public List<Team> getTeams() {
        return teams;
    }

    private List<Team> teams = new ArrayList<>();

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public String decideWinner(){

        //TODO in case of draw

        String winningTeamName = teams.stream().sorted(Comparator.comparing(Team::getPoints).reversed()).findFirst().get().getTeamName();

        return winningTeamName;
    }
}
