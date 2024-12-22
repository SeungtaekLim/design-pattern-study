public class Main {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        team.addMember(new Manager("홍명보"));
        team.addMember(new Coach("차두리"));

        FootballPlayers playersGroup = new FootballPlayers();
        playersGroup.addPlayer(new Player("손흥민"));
        playersGroup.addPlayer(new Player("이강인"));

        team.addMember(playersGroup);
        team.participate();
    }
}