public class Main {

    public static void main(String[] args) {
	// write your code here
        GuessGame game = GuessGame.getInstance();
        game.play();

        int score = game.getScore();
        GuessGame anotherGameGuess = GuessGame.getInstance();
        System.out.println(score);
        if(game == anotherGameGuess) {
            System.out.println("Singleton!");
            if(score == anotherGameGuess.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}
