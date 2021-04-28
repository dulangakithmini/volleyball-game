import java.util.ArrayList;
import java.util.List;

public class Application {

    public void run() {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");
        Player player4 = new Player("Player 4");
        Player player5 = new Player("Player 5");
        Player player6 = new Player("Player 6");

        List<Player> playerList1 = new ArrayList<>();
        playerList1.add(player1);
        playerList1.add(player2);
        playerList1.add(player3);

        List<Player> playerList2 = new ArrayList<>();
        playerList2.add(player4);
        playerList2.add(player5);
        playerList2.add(player6);

        Team team1 = new Team("Team 1", playerList1);
        Team team2 = new Team("Team 2", playerList2);

        System.out.println("Players of " +team1.getName());
        for (int i =0; i<playerList1.size(); i++) {
            System.out.println(team1.getTeam().get(i).getName());
        }

        System.out.println("Players of " +team2.getName());
        for (int i =0; i<playerList2.size(); i++) {
            System.out.println(team2.getTeam().get(i).getName());
        }

        Game game = new Game();
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        System.out.println("Volleyball match between " +team1.getName() + " and " +team2.getName() + " started!");

        while (ScoreKeeper.team1Score < 10 && ScoreKeeper.team2Score < 10) {
            Player player_1 = team1.getTeam().get(game.playTeam1());
            if (game.playTeam1()>0){
                player_1.receiveBall(player_1.getName());
                ScoreKeeper.team1Score ++ ;
            }else {
                System.out.println(team1.getName() + " missed the ball");
            }

            Player player_2 = team2.getTeam().get(game.playTeam2());
            if (game.playTeam2()>0){
                player_2.receiveBall(player_2.getName());
                ScoreKeeper.team2Score ++ ;
            }else {
                System.out.println(team2.getName() + " missed the ball");
            }

            scoreKeeper.printScore();
        }
        scoreKeeper.printWinner();
    }
}
