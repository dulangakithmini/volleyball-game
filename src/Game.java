import java.util.Random;

public class Game {
    int upperbound = 3;
    int min = 1;
    int max = 10;

    public int playTeam1() {
        Random rand1 = new Random();

        int random1 = rand1.nextInt((max-min) + 1)+min;

        if (random1 >3) {
            Random rand = new Random();
            int random = rand.nextInt(upperbound);
            return random;
        }else {
            return 0;
        }
    }

    public int playTeam2() {
        Random rand1 = new Random();

        int random1 = rand1.nextInt((max-min) + 1)+min;

        if (random1 >3) {
            Random rand = new Random();
            int random = rand.nextInt(upperbound);
            return random;
        }else {
            return 0;
        }
    }
}
