
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private GuessGame() {
    }
    private static GuessGame instance = new GuessGame();
    private int score = 0;
    public static GuessGame getInstance() {
        return instance;
    }
    public int getScore() {
        return score;
    }
    public void play() {
        int counter = 0;
        Random ran = new Random();
        while(counter<10) {
            int x = ran.nextInt(10);
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == x) {
                score++;
                System.out.println("Poprawnie");
            } else {
                System.out.println("Nieoprawnie");
            }
            counter++;
        }
    }
}
