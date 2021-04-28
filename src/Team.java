import java.util.List;

public class Team {
    private String name;
    private List<Player> team;

    public Team(String name, List<Player> playerList) {
        this.name = name;
        this.team = playerList;
    }

    public List<Player> getTeam(){
        return team;
    }

    public String getName() {
        return name;
    }
}
