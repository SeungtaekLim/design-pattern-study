import java.util.ArrayList;
import java.util.List;

class FootballTeam implements TeamMember {
    private List<TeamMember> members = new ArrayList<>();

    public void addMember(TeamMember member) {
        members.add(member);
    }

    @Override
    public void participate() {
        for (TeamMember member : members) {
            member.participate();
        }
    }
}