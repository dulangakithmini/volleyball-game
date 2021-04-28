public class ScoreKeeper {
    public static int team1Score;
    public static int team2Score;

    public void printScore() {
        System.out.println("Score " + team1Score + " : " + team2Score);
    }

    public void printWinner() {
        if (team1Score>=10) {
            System.out.println("Team 1 wins!");
        }else {
            System.out.println("Team 2 wins!");
        }
    }
}
