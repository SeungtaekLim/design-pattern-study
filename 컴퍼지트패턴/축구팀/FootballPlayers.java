import java.util.ArrayList;
import java.util.List;

class FootballPlayers implements TeamMember {
    private List<TeamMember> players = new ArrayList<>();

    public void addPlayer(TeamMember player) {
        players.add(player);
    }

    @Override
    public void participate() {
        for (TeamMember player : players) {
            player.participate();
        }
    }
}